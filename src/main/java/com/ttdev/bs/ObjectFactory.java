//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.22 a las 04:32:00 PM BST 
//


package com.ttdev.bs;


import javax.xml.bind.annotation.XmlRegistry;


import com.ttdev.bs.Concat;
import com.ttdev.bs.ConcatResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Result.CommentBody }
     * 
     */
    public Result.CommentBody createResultCommentBody() {
        return new Result.CommentBody();
    }

    /**
     * Create an instance of {@link Result.CommentBody.Und }
     * 
     */
    public Result.CommentBody.Und createResultCommentBodyUnd() {
        return new Result.CommentBody.Und();
    }

    /**
     * Create an instance of {@link Result.CommentBody.Und.Item }
     * 
     */
    public Result.CommentBody.Und.Item createResultCommentBodyUndItem() {
        return new Result.CommentBody.Und.Item();
    }
    
    public ConcatResponse createConcatResponse() {
        return new ConcatResponse();
    }

    /**
     * Create an instance of {@link Concat }
     * 
     */
    public Concat createConcat() {
        return new Concat();
    }

}
