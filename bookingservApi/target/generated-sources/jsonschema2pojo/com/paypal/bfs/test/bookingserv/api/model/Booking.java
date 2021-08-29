
package com.paypal.bfs.test.bookingserv.api.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Booking resource
 * <p>
 * Booking resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "date_of_birth",
    "checkIn_dateTime",
    "checkOut_dateTime",
    "totalPrize",
    "deposit",
    "address"
})
public class Booking {

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    private Integer id;
    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    private String firstName;
    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    private String lastName;
    /**
     * Date of Birth
     * 
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("Date of Birth")
    private String dateOfBirth;
    /**
     * Check-in Date Time
     * 
     */
    @JsonProperty("checkIn_dateTime")
    @JsonPropertyDescription("Check-in Date Time")
    private Date checkInDateTime;
    /**
     * Check-out Date Time
     * 
     */
    @JsonProperty("checkOut_dateTime")
    @JsonPropertyDescription("Check-out Date Time")
    private Date checkOutDateTime;
    /**
     * Total price
     * 
     */
    @JsonProperty("totalPrize")
    @JsonPropertyDescription("Total price")
    private Double totalPrize;
    /**
     * Deposit
     * 
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("Deposit")
    private Double deposit;
    /**
     * address
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of Birth
     * 
     */
    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of Birth
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Check-in Date Time
     * 
     */
    @JsonProperty("checkIn_dateTime")
    public Date getCheckInDateTime() {
        return checkInDateTime;
    }

    /**
     * Check-in Date Time
     * 
     */
    @JsonProperty("checkIn_dateTime")
    public void setCheckInDateTime(Date checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    /**
     * Check-out Date Time
     * 
     */
    @JsonProperty("checkOut_dateTime")
    public Date getCheckOutDateTime() {
        return checkOutDateTime;
    }

    /**
     * Check-out Date Time
     * 
     */
    @JsonProperty("checkOut_dateTime")
    public void setCheckOutDateTime(Date checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    /**
     * Total price
     * 
     */
    @JsonProperty("totalPrize")
    public Double getTotalPrize() {
        return totalPrize;
    }

    /**
     * Total price
     * 
     */
    @JsonProperty("totalPrize")
    public void setTotalPrize(Double totalPrize) {
        this.totalPrize = totalPrize;
    }

    /**
     * Deposit
     * 
     */
    @JsonProperty("deposit")
    public Double getDeposit() {
        return deposit;
    }

    /**
     * Deposit
     * 
     */
    @JsonProperty("deposit")
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Booking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("checkInDateTime");
        sb.append('=');
        sb.append(((this.checkInDateTime == null)?"<null>":this.checkInDateTime));
        sb.append(',');
        sb.append("checkOutDateTime");
        sb.append('=');
        sb.append(((this.checkOutDateTime == null)?"<null>":this.checkOutDateTime));
        sb.append(',');
        sb.append("totalPrize");
        sb.append('=');
        sb.append(((this.totalPrize == null)?"<null>":this.totalPrize));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
