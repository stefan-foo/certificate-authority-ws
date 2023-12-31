/*
 * This file is generated by jOOQ.
 */
package rs.elfak.ocspresponder.db.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import rs.elfak.ocspresponder.db.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RevocationStatusCode implements EnumType {

    keyCompromise("keyCompromise"),

    affiliationChanged("affiliationChanged"),

    superseded("superseded"),

    cessationOfOperation("cessationOfOperation"),

    privilegeWithdrawn("privilegeWithdrawn");

    private final String literal;

    private RevocationStatusCode(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public String getName() {
        return "revocation_status_code";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static RevocationStatusCode lookupLiteral(String literal) {
        return EnumType.lookupLiteral(RevocationStatusCode.class, literal);
    }
}
