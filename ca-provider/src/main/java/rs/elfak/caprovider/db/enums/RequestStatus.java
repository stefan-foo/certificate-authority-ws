/*
 * This file is generated by jOOQ.
 */
package rs.elfak.caprovider.db.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import rs.elfak.caprovider.db.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RequestStatus implements EnumType {

    PENDING("PENDING"),

    APPROVED("APPROVED"),

    REJECTED("REJECTED");

    private final String literal;

    private RequestStatus(String literal) {
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
        return "request_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static RequestStatus lookupLiteral(String literal) {
        return EnumType.lookupLiteral(RequestStatus.class, literal);
    }
}