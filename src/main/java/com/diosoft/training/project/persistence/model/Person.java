package com.diosoft.training.project.persistence.model;

import com.google.common.base.Objects;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Person implements Serializable {

    @Id
    private ObjectId _id;

    private String username;
    private String password;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("_id", _id)
                .add("username", username)
                .add("password", "*******")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person agent = (Person) o;

        if (!_id.equals(agent._id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + _id.hashCode();
        hash = hash * 31 + username.hashCode();
        hash = hash * 31 + password.hashCode();
        return hash;
    }
}
