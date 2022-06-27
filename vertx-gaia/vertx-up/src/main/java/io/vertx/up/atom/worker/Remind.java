package io.vertx.up.atom.worker;

import com.fasterxml.jackson.databind.ClassDeserializer;
import com.fasterxml.jackson.databind.ClassSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * This worker is for @WebSocket annotation to configure the active sending message
 * for alert ( Internal WebSite Message )
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class Remind implements Serializable {

    private String name;

    private String address;

    private String incomeAddress;

    @JsonSerialize(using = ClassSerializer.class)
    @JsonDeserialize(using = ClassDeserializer.class)
    private Class<?> income;

    private Object proxy;

    private Method method;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getIncomeAddress() {
        return this.incomeAddress;
    }

    public void setIncomeAddress(final String incomeAddress) {
        this.incomeAddress = incomeAddress;
    }

    public Class<?> getIncome() {
        return this.income;
    }

    public void setIncome(final Class<?> income) {
        this.income = income;
    }

    public Object getProxy() {
        return this.proxy;
    }

    public void setProxy(final Object proxy) {
        this.proxy = proxy;
    }

    public Method getMethod() {
        return this.method;
    }

    public void setMethod(final Method method) {
        this.method = method;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Remind remind = (Remind) o;
        return this.address.equals(remind.address) && this.method.equals(remind.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.address, this.method);
    }

    @Override
    public String toString() {
        return "Remind{" +
            "name='" + this.name + '\'' +
            ", address='" + this.address + '\'' +
            ", incomeAddress='" + this.incomeAddress + '\'' +
            ", income=" + this.income +
            '}';
    }
}
