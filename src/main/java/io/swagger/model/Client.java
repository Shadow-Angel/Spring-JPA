package io.swagger.model;

import java.sql.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

/**
 * Client
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-02T02:01:10.506Z")

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("numberPhone")
    private String numberPhone = null;

    @JsonProperty("updatedAt")
    private Date updatedAt = null;

    @JsonProperty("createdAt")
    private Date createdAt = null;

    @JsonProperty("birthDay")
    private Date birthDay = null;

    public Client id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    @ApiModelProperty(value = "")


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Client email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @ApiModelProperty(value = "")


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    @ApiModelProperty(value = "")


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Client numberPhoe(String numberPhoe) {
        this.numberPhone = numberPhoe;
        return this;
    }

    /**
     * Get numberPhone
     *
     * @return numberPhone
     **/
    @ApiModelProperty(value = "")


    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Client updatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Client createdAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Client birthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    /**
     * Get birthDay
     *
     * @return birthDay
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(this.id, client.id) &&
                Objects.equals(this.name, client.name) &&
                Objects.equals(this.lastName, client.lastName) &&
                Objects.equals(this.email, client.email) &&
                Objects.equals(this.password, client.password) &&
                Objects.equals(this.numberPhone, client.numberPhone) &&
                Objects.equals(this.updatedAt, client.updatedAt) &&
                Objects.equals(this.createdAt, client.createdAt) &&
                Objects.equals(this.birthDay, client.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, email, password, numberPhone, updatedAt, createdAt, birthDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Client {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    numberPhone: ").append(toIndentedString(numberPhone)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    birthDay: ").append(toIndentedString(birthDay)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

