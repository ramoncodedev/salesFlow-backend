package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.core.gateway.CustomerRepository;
import com.sales.flow.SalesFlow.core.gateway.LeadRepository;
import java.time.LocalDateTime;
import java.util.Optional;

public class ConverterLeadUseCaseImp implements ConverterLeadUseCase {

    private final LeadRepository leadRepository;
    private final CustomerRepository customerRepository;

    public ConverterLeadUseCaseImp(LeadRepository leadRepository, CustomerRepository customerRepository) {
        this.leadRepository = leadRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public Customers executar(Long leadId) {
        Optional<Lead> leadOpt = leadRepository.buscarPorId(leadId);
        if (leadOpt.isEmpty()) {
            throw new RuntimeException("Lead não encontrado com ID: " + leadId);
        }
        
        Lead lead = leadOpt.get();
        
        if (lead.getCustomer() != null) {
            throw new RuntimeException("Lead já convertido");
        }

        Customers customer = new Customers();
        customer.setName(lead.getNome());
        customer.setEmail(lead.getEmail());
        customer.setTelefone(lead.getTelefone());
        customer.setEmpresa(lead.getEmpresa());
        customer.setCrieadoEm(LocalDateTime.now());
        customer.setUltimoContato(LocalDateTime.now());

        Customers savedCustomer = customerRepository.salvar(customer);

        lead.setStatus(LeadStatus.CONVERTIDO);
        lead.setCustomer(savedCustomer);
        leadRepository.atualizar(lead);

        return savedCustomer;
    }
}