package org.unichristus.composite;

public class Main {
    public static void main(String[] args) {
        FinancialDepartment financialDepartment = new FinancialDepartment(1, "Financiamento");
        SalesDepartment salesDepartment = new SalesDepartment(2, "Vendas");
        EducationalDepartment educational = new EducationalDepartment(4, "Educational");
        HeadDepartament head = new HeadDepartament(3, "Diretor");
        ManagerDepartment manager = new ManagerDepartment(5, "Gerentão");

        head.addDepartament(financialDepartment);
        head.addDepartament(salesDepartment);
        head.addDepartament(educational);

        manager.addDepartament(head);

        manager.printDepartment();
    }
}
