package com.marcos.cursomc.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.marcos.cursomc.domain.enums.TipoCliente;
import com.marcos.cursomc.dto.ClienteNewDTO;
import com.marcos.cursomc.resources.Exception.FieldMessage;
import com.marcos.cursomc.services.validation.utils.BR;

public class ClientInsertValidator implements ConstraintValidator<ClientInsert, ClienteNewDTO> {
	
	@Override
	public void initialize(ClientInsert ann) {
	}

@Override
public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
List<FieldMessage> list = new ArrayList<>();
// inclua os testes aqui, inserindo erros na lista

	if (objDto.getTipo().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidCPF(objDto.getCpfOuCnpj())){
		list.add(new FieldMessage("cpfOuCnpj","CPF invalido"));
	}
	
	if (objDto.getTipo().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidCNPJ(objDto.getCpfOuCnpj())){
		list.add(new FieldMessage("cpfOuCnpj","CNPJ invalido"));
	}
	
	for (FieldMessage e:list)
	{
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldname())
				.addConstraintViolation();
		}
	return list.isEmpty();
	}
}

