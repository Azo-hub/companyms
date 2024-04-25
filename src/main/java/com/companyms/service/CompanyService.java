package com.companyms.service;

import com.companyms.domain.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    Company createCompany(Company company);

    Company updateCompany(Long id, Company company);

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);
}
