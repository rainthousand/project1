//package com.maskmanage.controller;
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.media.ArraySchema;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.Oauth2RestServices.mapper.DepartmentMapper;
//import org.Oauth2RestServices.mapper.EmployeeMapper;
//import org.Oauth2RestServices.models.Department;
//import org.Oauth2RestServices.models.Employee;
//import org.Oauth2RestServices.service.EmpoyeeService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.hateoas.Link;
//import org.springframework.hateoas.MediaTypes;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.util.CollectionUtils;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/mycompany")
//@Tag(name = "employee", description = "the Employee API")
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class EmployeeController {
//	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
//
//	@Autowired
//	EmpoyeeService empService;
//
//	@Autowired
//	DepartmentMapper deptMapper;
//
//	@Autowired
//	EmployeeMapper empMapper;
//
//    @Operation(summary = "Add a new Employee", description = "", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "201", description = "Employee created",
//                content = @Content(schema = @Schema(implementation = Employee.class))),
//        @ApiResponse(responseCode = "400", description = "Invalid input"),
//        @ApiResponse(responseCode = "409", description = "Contact already exists") })
//	@RequestMapping(value="/new/employee", method = RequestMethod.POST)
//    @PreAuthorize("hasAuthority('INVENTORY_ADD')")
//	public Employee createEmployee(@Parameter(description="Employee to add. Cannot null or empty.", required=true, schema=@Schema(implementation = Employee.class))
//	                               @RequestBody Employee emp){
//
//		return empService.createEmployee(emp);
//	}
//
//
//    @Operation(summary = "Find employee by ID", description = "Returns a single employee with its Hateoas", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "successful operation",
//                content = @Content(schema = @Schema(implementation = Employee.class))),
//        @ApiResponse(responseCode = "404", description = "Employee not found") })
//
//	@RequestMapping(value="/employees/{empId}",method = RequestMethod.GET, produces=MediaTypes.HAL_JSON_VALUE)
//    @PreAuthorize("hasAuthority('INVENTORY_VIEW')")
//	public Employee getEmplyee( @Parameter(description="Id of the Employee to be obtained. Cannot be empty.", required=true)
//			                    @PathVariable Long empId){
//		logger.info("calling employee service");
//		Employee emp = empService.getEmplyee(empId);
//
//		Link getEmplink = WebMvcLinkBuilder.linkTo(EmployeeController.class).slash("employees").slash(emp.getEmpId()).withSelfRel();
//		Link delEmplink = WebMvcLinkBuilder.linkTo(EmployeeController.class).slash("employees").slash(emp.getEmpId()).withRel("delete employee").withMedia("DELETE").withTitle("delete employee");
//		Link postEmplink = WebMvcLinkBuilder.linkTo(EmployeeController.class).slash("update/employee").withRel("update employee").withMedia("POST").withTitle("update employee");
//		emp.add(getEmplink);
//		emp.add(delEmplink);
//		emp.add(postEmplink);
//
//
//		return emp;
//	}
//
//    @Operation(summary = "Find all employees", description = "", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "successful operation",
//                content = @Content(array = @ArraySchema(schema = @Schema(implementation = Employee.class)))) })
//
//    @GetMapping(value="/employees", produces=MediaTypes.HAL_JSON_VALUE)
//    @PreAuthorize("hasAuthority('INVENTORY_VIEW')")
//	public List<Employee> getAllEmployee(){
//		List<Employee> empsWithLinks= new ArrayList<>();
//		List<Employee> employees = empService.getAllEmployee();
//		if(!CollectionUtils.isEmpty(employees) ){
//			for(Employee emp : employees){
//
//				Link getEmplink = WebMvcLinkBuilder.linkTo(EmployeeController.class).slash("getEmp").slash(emp.getEmpId()).withSelfRel();
//				Link delEmplink = WebMvcLinkBuilder.linkTo(EmployeeController.class).slash("delEmp")
//						.slash(emp.getEmpId()).withRel("delete employee").withMedia("DELETE").withTitle("delete employee");
//
//				emp.add(getEmplink);
//				emp.add(delEmplink);
//				empsWithLinks.add(emp);
//			}
//		}
//		return empsWithLinks;
//	}
//
//    @Operation(summary = "Update a Employee", description = "", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "201", description = "Employee updated",
//                content = @Content(schema = @Schema(implementation = Employee.class))),
//        @ApiResponse(responseCode = "400", description = "Invalid input"),
//        @ApiResponse(responseCode = "409", description = "Employee not exists") })
//
//    @RequestMapping(value="/update/employee",method = RequestMethod.POST)
//    @PreAuthorize("hasAuthority('INVENTORY_ADD')")
//	public Employee updateEmployee( @Parameter(description="Employee to update. Cannot null or empty.", required=true, schema=@Schema(implementation = Employee.class))
//			                        @RequestBody Employee emp){
//
//		return empService.updateEmployee(emp);
//	}
//
//    @Operation(summary = "输入Employee ID, 删除相应的Employee记录", description = "Return True if the employee deleted, False if error encountered.", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "successful operation",
//                content = @Content(schema = @Schema(implementation = Employee.class))),
//        @ApiResponse(responseCode = "404", description = "Employee not found") })
//
//	@RequestMapping(value="/employees/{empId}", method = RequestMethod.DELETE )
//    @PreAuthorize("hasAuthority('INVENTORY_ADD')")
//	public boolean deleteEmployee( @Parameter(description="Id of the Employee to be deleted. Cannot be empty.", required=true)
//			                       @PathVariable Long empId){
//
//		return empService.deleteEmployee(empId);
//	}
//
//    @Operation(summary = "Find employees of a department by department ID / 输入部门编码， 查询该部门的所有员工", description = "Returns a department with its employees.", tags = { "employee" })
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "successful operation",
//                content = @Content(schema = @Schema(implementation = Employee.class))),
//        @ApiResponse(responseCode = "404", description = "department not found") })
//
//    @GetMapping("/departments/{deptCode}")
//    @PreAuthorize("hasAuthority('INVENTORY_VIEW')")
//	@Cacheable(value= "deptCache", key= "#deptCode")
//	public Department getDepartmentByCode( @Parameter(description="Department code, such as ADM . Cannot be empty.", required=true)
//			                               @PathVariable String deptCode){
//		Department dept = deptMapper.getDepartmentByDeptCode(deptCode);
//		 return dept;
//	}
//
//    @Operation(summary = "Find employees of a department by department ID / 输入部门编码， 查询该部门的所有员工", description = "Returns a list of its employees.", tags = { "employee" })
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "successful operation",
//                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Employee.class)))) })
//
//	@GetMapping("/departments/{deptCode}/employees")
//    @PreAuthorize("hasAuthority('INVENTORY_VIEW')")
//	@Cacheable(value= "employeesbydeptCache", key= "#p0")
//	public List<Employee> getEmployeeByDeptCode(@PathVariable String deptCode){
//		return empMapper.getEmployeeByDeptCode(deptCode);
//	}
//
//}
