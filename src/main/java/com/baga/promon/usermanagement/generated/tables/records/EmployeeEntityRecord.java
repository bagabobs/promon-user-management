/*
 * This file is generated by jOOQ.
 */
package com.baga.promon.usermanagement.generated.tables.records;


import com.baga.promon.usermanagement.generated.tables.EmployeeEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeEntityRecord extends UpdatableRecordImpl<EmployeeEntityRecord> implements Record4<BigDecimal, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.employee_entity.id</code>.
     */
    public void setId(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employee_entity.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>public.employee_entity.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employee_entity.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.employee_entity.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employee_entity.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employee_entity.join_date</code>.
     */
    public void setJoinDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employee_entity.join_date</code>.
     */
    public LocalDateTime getJoinDate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<BigDecimal, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<BigDecimal, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return EmployeeEntity.EMPLOYEE_ENTITY.ID;
    }

    @Override
    public Field<String> field2() {
        return EmployeeEntity.EMPLOYEE_ENTITY.NAME;
    }

    @Override
    public Field<String> field3() {
        return EmployeeEntity.EMPLOYEE_ENTITY.ADDRESS;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return EmployeeEntity.EMPLOYEE_ENTITY.JOIN_DATE;
    }

    @Override
    public BigDecimal component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public LocalDateTime component4() {
        return getJoinDate();
    }

    @Override
    public BigDecimal value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public LocalDateTime value4() {
        return getJoinDate();
    }

    @Override
    public EmployeeEntityRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    @Override
    public EmployeeEntityRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EmployeeEntityRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public EmployeeEntityRecord value4(LocalDateTime value) {
        setJoinDate(value);
        return this;
    }

    @Override
    public EmployeeEntityRecord values(BigDecimal value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeEntityRecord
     */
    public EmployeeEntityRecord() {
        super(EmployeeEntity.EMPLOYEE_ENTITY);
    }

    /**
     * Create a detached, initialised EmployeeEntityRecord
     */
    public EmployeeEntityRecord(BigDecimal id, String name, String address, LocalDateTime joinDate) {
        super(EmployeeEntity.EMPLOYEE_ENTITY);

        setId(id);
        setName(name);
        setAddress(address);
        setJoinDate(joinDate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised EmployeeEntityRecord
     */
    public EmployeeEntityRecord(com.baga.promon.usermanagement.generated.tables.pojos.EmployeeEntity value) {
        super(EmployeeEntity.EMPLOYEE_ENTITY);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setJoinDate(value.getJoinDate());
            resetChangedOnNotNull();
        }
    }
}
