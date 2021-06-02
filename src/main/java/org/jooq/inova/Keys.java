/*
 * This file is generated by jOOQ.
 */
package org.jooq.inova;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.inova.tables.Cursodis;
import org.jooq.inova.tables.Cursos;
import org.jooq.inova.tables.Disciplinas;
import org.jooq.inova.tables.Formandos;
import org.jooq.inova.tables.records.CursodisRecord;
import org.jooq.inova.tables.records.CursosRecord;
import org.jooq.inova.tables.records.DisciplinasRecord;
import org.jooq.inova.tables.records.FormandosRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * inova.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CursodisRecord> KEY_CURSODIS_PRIMARY = Internal.createUniqueKey(Cursodis.CURSODIS, DSL.name("KEY_cursodis_PRIMARY"), new TableField[] { Cursodis.CURSODIS.IDCURSOS, Cursodis.CURSODIS.IDDISCIPLINAS }, true);
    public static final UniqueKey<CursosRecord> KEY_CURSOS_PRIMARY = Internal.createUniqueKey(Cursos.CURSOS, DSL.name("KEY_cursos_PRIMARY"), new TableField[] { Cursos.CURSOS.IDCURSOS }, true);
    public static final UniqueKey<DisciplinasRecord> KEY_DISCIPLINAS_PRIMARY = Internal.createUniqueKey(Disciplinas.DISCIPLINAS, DSL.name("KEY_disciplinas_PRIMARY"), new TableField[] { Disciplinas.DISCIPLINAS.IDDISCIPLINAS }, true);
    public static final UniqueKey<FormandosRecord> KEY_FORMANDOS_PRIMARY = Internal.createUniqueKey(Formandos.FORMANDOS, DSL.name("KEY_formandos_PRIMARY"), new TableField[] { Formandos.FORMANDOS.IDFORMANDOS }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CursodisRecord, CursosRecord> FK_TABLE1_CURSOS = Internal.createForeignKey(Cursodis.CURSODIS, DSL.name("fk_table1_cursos"), new TableField[] { Cursodis.CURSODIS.IDCURSOS }, Keys.KEY_CURSOS_PRIMARY, new TableField[] { Cursos.CURSOS.IDCURSOS }, true);
    public static final ForeignKey<CursodisRecord, DisciplinasRecord> FK_TABLE1_DISCIPLINAS1 = Internal.createForeignKey(Cursodis.CURSODIS, DSL.name("fk_table1_disciplinas1"), new TableField[] { Cursodis.CURSODIS.IDDISCIPLINAS }, Keys.KEY_DISCIPLINAS_PRIMARY, new TableField[] { Disciplinas.DISCIPLINAS.IDDISCIPLINAS }, true);
    public static final ForeignKey<FormandosRecord, CursosRecord> FK_FORMANDOS_CURSOS1 = Internal.createForeignKey(Formandos.FORMANDOS, DSL.name("fk_formandos_cursos1"), new TableField[] { Formandos.FORMANDOS.IDCURSOS }, Keys.KEY_CURSOS_PRIMARY, new TableField[] { Cursos.CURSOS.IDCURSOS }, true);
}
