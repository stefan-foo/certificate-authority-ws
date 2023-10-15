/*
 * This file is generated by jOOQ.
 */
package rs.elfak.ocspresponder.db;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import rs.elfak.ocspresponder.db.tables.Certificate;
import rs.elfak.ocspresponder.db.tables.CertificateRequest;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>certificate</code>.
     */
    public final Certificate CERTIFICATE = Certificate.CERTIFICATE;

    /**
     * The table <code>certificate_request</code>.
     */
    public final CertificateRequest CERTIFICATE_REQUEST = CertificateRequest.CERTIFICATE_REQUEST;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Certificate.CERTIFICATE,
            CertificateRequest.CERTIFICATE_REQUEST
        );
    }
}
