package org.example.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
//import org.example.logic.flow.CreateAccountTypeFlow;
//import org.example.logic.flow.FetchAccountTypeFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.domain.service.GeneralResponse;
//import org.example.domain.dto.AccountTypeDto;
import java.util.List;

@RestController
@RequestMapping("account-type")
public class DemoController {

//    private final FetchAccountTypeFlow fetchAccountTypeFlow;
//    private final CreateAccountTypeFlow createAccountTypeFlow;
//
//    @Autowired
//    public DemoController(FetchAccountTypeFlow fetchAccountTypeFlow,
//                          @Qualifier("createAccountTypeFlowName")CreateAccountTypeFlow createAccountTypeFlow){
//        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
//        this.createAccountTypeFlow = createAccountTypeFlow;
//    }

    @GetMapping("/all")
//    @ApiOperation(value = "Gets all the configured account types.", notes = "Returns a list of all account types")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<List<AccountTypeDto>>> getAll() {
//        List<AccountTypeDto> accountTypes = fetchAccountTypeFlow.getAllAccountTypes();
//        GeneralResponse<List<AccountTypeDto>> response = new GeneralResponse<> (true, accountTypes);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

//    @PostMapping("")
//    @ApiOperation(value = "Creates all account Types.", notes = "Creates a new account Type in DB")
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "The AccountType was created successfully", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
//    public ResponseEntity<GeneralResponse<AccountTypeDto>> create(
//            @ApiParam(value = "Request body to create a new AccountType.",
//                    required = true)
//            @RequestBody AccountTypeDto accountType){
//        AccountTypeDto accountTypeResponse = createAccountTypeFlow.create(accountType);
//        GeneralResponse<AccountTypeDto> response = new GeneralResponse<>(true, accountTypeResponse);
//        return new ResponseEntity<>(response, HttpStatus.CREATED);
//    }


//    @GetMapping("{mnemonic}")
//    @ApiOperation(value = "Fetches the specified account type.", notes = "Fetches the AccountType corresponding to the given mnemonic")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Goal found", response = GeneralResponse.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
//            @ApiResponse(code = 404, message = "Resource not found", response = GeneralResponse.class),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
//    })
//    public ResponseEntity<GeneralResponse<AccountTypeDto>> getAccountType(

//        @ApiParam(value = "The mnemonic that uniquely identifies the AccountType.",
//                  example = "MILES",
//                   name = "mnemonic",
//                    required = true)
//        @PathVariable("mnemonic")final String mnemonic){
//
//            AccountTypeDto accountType = fetchAccountTypeFlow.getAccountTypeByMnemonic(mnemonic);
//            GeneralResponse<AccountTypeDto> response = new GeneralResponse<> (true, accountType);
//            return new ResponseEntity<>(response, HttpStatus.OK);
//
//    }
    public GeneralResponse<String> getAll()
    {
        return new GeneralResponse<>(true,"payload");
    }

}
