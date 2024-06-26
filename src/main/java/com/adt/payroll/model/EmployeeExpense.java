package com.adt.payroll.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(catalog = "EmployeeDB", schema = "employee_schema", name = "EmployeeExpenses")
public class EmployeeExpense {

//    Expense_id, expense_description, expense_category, expense_amount, comments, payment_date, payment_mode, attachment(Document_proof) and status.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="expenseId",columnDefinition = "serial")
    private int expenseId;

    private String employeeId;

    private String submitDate;

    private String expenseAmount;

    private String paymentDate;

    private String paymentMode;

    private String employeeComments;

    private String expenseCategory;

    private String expenseDescription;

    private String status;

    private String invoices;

    private String payrollComments;

}