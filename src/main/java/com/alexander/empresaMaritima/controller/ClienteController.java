package com.alexander.empresaMaritima.controller;

import com.alexander.empresaMaritima.dto.ClienteDTO;
import com.alexander.empresaMaritima.model.Cliente;
import com.alexander.empresaMaritima.service.Impl.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{ruc}")
    public ResponseEntity<ClienteDTO> getClienteByRuc(@PathVariable String ruc) {
        ClienteDTO clienteDTO = clienteService.findByRuc(ruc);
        if (clienteDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> saveCliente(@Valid @RequestBody ClienteDTO clienteDTO ) {
        try {
            ClienteDTO savedCliente = clienteService.save(clienteDTO);
            return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
        } catch (IllegalStateException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
