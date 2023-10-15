/*
 * This file is generated by jOOQ.
 */
package rs.elfak.caprovider.db.tables.pojos;


import java.time.LocalDateTime;

import rs.elfak.caprovider.db.enums.RequestStatus;
import rs.elfak.caprovider.db.enums.RequestType;
import rs.elfak.caprovider.db.tables.interfaces.ICertificateRequest;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CertificateRequest implements ICertificateRequest {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String country;
    private String state;
    private String name;
    private String organization;
    private String email;
    private RequestType requestType;
    private LocalDateTime timestamp;
    private RequestStatus status;
    private Integer certificate;

    public CertificateRequest() {}

    public CertificateRequest(ICertificateRequest value) {
        this.id = value.getId();
        this.country = value.getCountry();
        this.state = value.getState();
        this.name = value.getName();
        this.organization = value.getOrganization();
        this.email = value.getEmail();
        this.requestType = value.getRequestType();
        this.timestamp = value.getTimestamp();
        this.status = value.getStatus();
        this.certificate = value.getCertificate();
    }

    public CertificateRequest(
        Integer id,
        String country,
        String state,
        String name,
        String organization,
        String email,
        RequestType requestType,
        LocalDateTime timestamp,
        RequestStatus status,
        Integer certificate
    ) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.name = name;
        this.organization = organization;
        this.email = email;
        this.requestType = requestType;
        this.timestamp = timestamp;
        this.status = status;
        this.certificate = certificate;
    }

    /**
     * Getter for <code>certificate_request.id</code>.
     */
    @Override
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>certificate_request.id</code>.
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>certificate_request.country</code>.
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>certificate_request.country</code>.
     */
    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for <code>certificate_request.state</code>.
     */
    @Override
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>certificate_request.state</code>.
     */
    @Override
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for <code>certificate_request.name</code>.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>certificate_request.name</code>.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>certificate_request.organization</code>.
     */
    @Override
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Setter for <code>certificate_request.organization</code>.
     */
    @Override
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Getter for <code>certificate_request.email</code>.
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>certificate_request.email</code>.
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>certificate_request.request_type</code>.
     */
    @Override
    public RequestType getRequestType() {
        return this.requestType;
    }

    /**
     * Setter for <code>certificate_request.request_type</code>.
     */
    @Override
    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    /**
     * Getter for <code>certificate_request.timestamp</code>.
     */
    @Override
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for <code>certificate_request.timestamp</code>.
     */
    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for <code>certificate_request.status</code>.
     */
    @Override
    public RequestStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>certificate_request.status</code>.
     */
    @Override
    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    /**
     * Getter for <code>certificate_request.certificate</code>.
     */
    @Override
    public Integer getCertificate() {
        return this.certificate;
    }

    /**
     * Setter for <code>certificate_request.certificate</code>.
     */
    @Override
    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CertificateRequest other = (CertificateRequest) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.country == null) {
            if (other.country != null)
                return false;
        }
        else if (!this.country.equals(other.country))
            return false;
        if (this.state == null) {
            if (other.state != null)
                return false;
        }
        else if (!this.state.equals(other.state))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.organization == null) {
            if (other.organization != null)
                return false;
        }
        else if (!this.organization.equals(other.organization))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.requestType == null) {
            if (other.requestType != null)
                return false;
        }
        else if (!this.requestType.equals(other.requestType))
            return false;
        if (this.timestamp == null) {
            if (other.timestamp != null)
                return false;
        }
        else if (!this.timestamp.equals(other.timestamp))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.certificate == null) {
            if (other.certificate != null)
                return false;
        }
        else if (!this.certificate.equals(other.certificate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.organization == null) ? 0 : this.organization.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.requestType == null) ? 0 : this.requestType.hashCode());
        result = prime * result + ((this.timestamp == null) ? 0 : this.timestamp.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.certificate == null) ? 0 : this.certificate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CertificateRequest (");

        sb.append(id);
        sb.append(", ").append(country);
        sb.append(", ").append(state);
        sb.append(", ").append(name);
        sb.append(", ").append(organization);
        sb.append(", ").append(email);
        sb.append(", ").append(requestType);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(status);
        sb.append(", ").append(certificate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICertificateRequest from) {
        setId(from.getId());
        setCountry(from.getCountry());
        setState(from.getState());
        setName(from.getName());
        setOrganization(from.getOrganization());
        setEmail(from.getEmail());
        setRequestType(from.getRequestType());
        setTimestamp(from.getTimestamp());
        setStatus(from.getStatus());
        setCertificate(from.getCertificate());
    }

    @Override
    public <E extends ICertificateRequest> E into(E into) {
        into.from(this);
        return into;
    }
}
