/*
 * This file is generated by jOOQ.
 */
package org.jooq.inova.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.inova.tables.Disciplinas;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DisciplinasRecord extends UpdatableRecordImpl<DisciplinasRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>inova.disciplinas.iddisciplinas</code>.
     */
    public void setIddisciplinas(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>inova.disciplinas.iddisciplinas</code>.
     */
    public Integer getIddisciplinas() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>inova.disciplinas.nome</code>.
     */
    public void setNome(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>inova.disciplinas.nome</code>.
     */
    public String getNome() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Disciplinas.DISCIPLINAS.IDDISCIPLINAS;
    }

    @Override
    public Field<String> field2() {
        return Disciplinas.DISCIPLINAS.NOME;
    }

    @Override
    public Integer component1() {
        return getIddisciplinas();
    }

    @Override
    public String component2() {
        return getNome();
    }

    @Override
    public Integer value1() {
        return getIddisciplinas();
    }

    @Override
    public String value2() {
        return getNome();
    }

    @Override
    public DisciplinasRecord value1(Integer value) {
        setIddisciplinas(value);
        return this;
    }

    @Override
    public DisciplinasRecord value2(String value) {
        setNome(value);
        return this;
    }

    @Override
    public DisciplinasRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DisciplinasRecord
     */
    public DisciplinasRecord() {
        super(Disciplinas.DISCIPLINAS);
    }

    /**
     * Create a detached, initialised DisciplinasRecord
     */
    public DisciplinasRecord(Integer iddisciplinas, String nome) {
        super(Disciplinas.DISCIPLINAS);

        setIddisciplinas(iddisciplinas);
        setNome(nome);
    }
}
