/*
 * This file is generated by jOOQ.
 */
package org.jooq.inova.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.inova.tables.Cursos;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CursosRecord extends UpdatableRecordImpl<CursosRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>inova.cursos.idcursos</code>.
     */
    public void setIdcursos(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>inova.cursos.idcursos</code>.
     */
    public Integer getIdcursos() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>inova.cursos.nome</code>.
     */
    public void setNome(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>inova.cursos.nome</code>.
     */
    public String getNome() {
        return (String) get(1);
    }

    /**
     * Setter for <code>inova.cursos.ano</code>.
     */
    public void setAno(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>inova.cursos.ano</code>.
     */
    public Integer getAno() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Cursos.CURSOS.IDCURSOS;
    }

    @Override
    public Field<String> field2() {
        return Cursos.CURSOS.NOME;
    }

    @Override
    public Field<Integer> field3() {
        return Cursos.CURSOS.ANO;
    }

    @Override
    public Integer component1() {
        return getIdcursos();
    }

    @Override
    public String component2() {
        return getNome();
    }

    @Override
    public Integer component3() {
        return getAno();
    }

    @Override
    public Integer value1() {
        return getIdcursos();
    }

    @Override
    public String value2() {
        return getNome();
    }

    @Override
    public Integer value3() {
        return getAno();
    }

    @Override
    public CursosRecord value1(Integer value) {
        setIdcursos(value);
        return this;
    }

    @Override
    public CursosRecord value2(String value) {
        setNome(value);
        return this;
    }

    @Override
    public CursosRecord value3(Integer value) {
        setAno(value);
        return this;
    }

    @Override
    public CursosRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CursosRecord
     */
    public CursosRecord() {
        super(Cursos.CURSOS);
    }

    /**
     * Create a detached, initialised CursosRecord
     */
    public CursosRecord(Integer idcursos, String nome, Integer ano) {
        super(Cursos.CURSOS);

        setIdcursos(idcursos);
        setNome(nome);
        setAno(ano);
    }
}
