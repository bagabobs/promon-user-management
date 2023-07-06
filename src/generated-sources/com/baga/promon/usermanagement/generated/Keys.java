/*
 * This file is generated by jOOQ.
 */
package com.baga.promon.usermanagement.generated;


import com.baga.promon.usermanagement.generated.tables.Employees;
import com.baga.promon.usermanagement.generated.tables.records.EmployeesRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmployeesRecord> EMPLOYEE_PK = Internal.createUniqueKey(Employees.EMPLOYEES, DSL.name("employee_pk"), new TableField[] { Employees.EMPLOYEES.ID }, true);
}
