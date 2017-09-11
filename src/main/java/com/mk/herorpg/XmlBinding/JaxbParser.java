package com.mk.herorpg.XmlBinding;

import javax.xml.bind.JAXBException;
import java.io.File;

public interface JaxbParser {
    Object getObject(File file, Class c) throws JAXBException;
    void saveObject(File file, Object obj) throws JAXBException;
}
