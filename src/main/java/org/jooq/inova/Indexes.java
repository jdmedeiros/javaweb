/*
 * This file is generated by jOOQ.
 */
package org.jooq.inova;


import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.inova.tables.Cursodis;
import org.jooq.inova.tables.Formandos;


/**
 * A class modelling indexes of tables in inova.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FORMANDOS_FK_FORMANDOS_CURSOS1_IDX = Internal.createIndex(DSL.name("fk_formandos_cursos1_idx"), Formandos.FORMANDOS, new OrderField[] { Formandos.FORMANDOS.IDCURSOS }, false);
    public static final Index CURSODIS_FK_TABLE1_DISCIPLINAS1_IDX = Internal.createIndex(DSL.name("fk_table1_disciplinas1_idx"), Cursodis.CURSODIS, new OrderField[] { Cursodis.CURSODIS.IDDISCIPLINAS }, false);
}
