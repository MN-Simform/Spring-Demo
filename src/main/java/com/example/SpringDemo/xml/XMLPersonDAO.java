package com.example.SpringDemo.xml;


//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XMLPersonDAO {

    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
