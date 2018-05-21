//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.21 a las 11:07:47 PM BST 
//


package com.ttdev.bs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="promote" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="sticky" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tnid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="translate" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="revision_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revision_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="title_field">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="es">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="field_product">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="und">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="field_image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_category">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="und">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="field_tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_fecha_de_creaci_n">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="und">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="timezone_db" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="date_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="field_descripci_n">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="und">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="title_original" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="last_comment_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_comment_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_comment_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="comment_count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vid",
    "uid",
    "title",
    "log",
    "status",
    "comment",
    "promote",
    "sticky",
    "nid",
    "type",
    "language",
    "created",
    "changed",
    "tnid",
    "translate",
    "revisionTimestamp",
    "revisionUid",
    "titleField",
    "fieldProduct",
    "fieldImage",
    "fieldCategory",
    "fieldTipo",
    "fieldFechaDeCreaciN",
    "fieldDescripciN",
    "titleOriginal",
    "path",
    "cid",
    "lastCommentTimestamp",
    "lastCommentName",
    "lastCommentUid",
    "commentCount",
    "name",
    "picture",
    "data"
})
@XmlRootElement(name = "result")
public class Result {

    protected byte vid;
    protected byte uid;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String log;
    protected byte status;
    protected byte comment;
    protected byte promote;
    protected byte sticky;
    protected byte nid;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String language;
    protected int created;
    protected int changed;
    protected byte tnid;
    protected byte translate;
    @XmlElement(name = "revision_timestamp")
    protected int revisionTimestamp;
    @XmlElement(name = "revision_uid")
    protected byte revisionUid;
    @XmlElement(name = "title_field", required = true)
    protected Result.TitleField titleField;
    @XmlElement(name = "field_product", required = true)
    protected Result.FieldProduct fieldProduct;
    @XmlElement(name = "field_image", required = true)
    protected String fieldImage;
    @XmlElement(name = "field_category", required = true)
    protected Result.FieldCategory fieldCategory;
    @XmlElement(name = "field_tipo", required = true)
    protected String fieldTipo;
    @XmlElement(name = "field_fecha_de_creaci_n", required = true)
    protected Result.FieldFechaDeCreaciN fieldFechaDeCreaciN;
    @XmlElement(name = "field_descripci_n", required = true)
    protected Result.FieldDescripciN fieldDescripciN;
    @XmlElement(name = "title_original", required = true)
    protected String titleOriginal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String path;
    protected byte cid;
    @XmlElement(name = "last_comment_timestamp")
    protected int lastCommentTimestamp;
    @XmlElement(name = "last_comment_name", required = true)
    protected String lastCommentName;
    @XmlElement(name = "last_comment_uid")
    protected byte lastCommentUid;
    @XmlElement(name = "comment_count")
    protected byte commentCount;
    @XmlElement(required = true)
    protected String name;
    protected byte picture;
    @XmlElement(required = true)
    protected String data;

    /**
     * Obtiene el valor de la propiedad vid.
     * 
     */
    public byte getVid() {
        return vid;
    }

    /**
     * Define el valor de la propiedad vid.
     * 
     */
    public void setVid(byte value) {
        this.vid = value;
    }

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     */
    public byte getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     */
    public void setUid(byte value) {
        this.uid = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     */
    public byte getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     */
    public void setComment(byte value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad promote.
     * 
     */
    public byte getPromote() {
        return promote;
    }

    /**
     * Define el valor de la propiedad promote.
     * 
     */
    public void setPromote(byte value) {
        this.promote = value;
    }

    /**
     * Obtiene el valor de la propiedad sticky.
     * 
     */
    public byte getSticky() {
        return sticky;
    }

    /**
     * Define el valor de la propiedad sticky.
     * 
     */
    public void setSticky(byte value) {
        this.sticky = value;
    }

    /**
     * Obtiene el valor de la propiedad nid.
     * 
     */
    public byte getNid() {
        return nid;
    }

    /**
     * Define el valor de la propiedad nid.
     * 
     */
    public void setNid(byte value) {
        this.nid = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     */
    public int getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     */
    public void setCreated(int value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad changed.
     * 
     */
    public int getChanged() {
        return changed;
    }

    /**
     * Define el valor de la propiedad changed.
     * 
     */
    public void setChanged(int value) {
        this.changed = value;
    }

    /**
     * Obtiene el valor de la propiedad tnid.
     * 
     */
    public byte getTnid() {
        return tnid;
    }

    /**
     * Define el valor de la propiedad tnid.
     * 
     */
    public void setTnid(byte value) {
        this.tnid = value;
    }

    /**
     * Obtiene el valor de la propiedad translate.
     * 
     */
    public byte getTranslate() {
        return translate;
    }

    /**
     * Define el valor de la propiedad translate.
     * 
     */
    public void setTranslate(byte value) {
        this.translate = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionTimestamp.
     * 
     */
    public int getRevisionTimestamp() {
        return revisionTimestamp;
    }

    /**
     * Define el valor de la propiedad revisionTimestamp.
     * 
     */
    public void setRevisionTimestamp(int value) {
        this.revisionTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionUid.
     * 
     */
    public byte getRevisionUid() {
        return revisionUid;
    }

    /**
     * Define el valor de la propiedad revisionUid.
     * 
     */
    public void setRevisionUid(byte value) {
        this.revisionUid = value;
    }

    /**
     * Obtiene el valor de la propiedad titleField.
     * 
     * @return
     *     possible object is
     *     {@link Result.TitleField }
     *     
     */
    public Result.TitleField getTitleField() {
        return titleField;
    }

    /**
     * Define el valor de la propiedad titleField.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.TitleField }
     *     
     */
    public void setTitleField(Result.TitleField value) {
        this.titleField = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldProduct.
     * 
     * @return
     *     possible object is
     *     {@link Result.FieldProduct }
     *     
     */
    public Result.FieldProduct getFieldProduct() {
        return fieldProduct;
    }

    /**
     * Define el valor de la propiedad fieldProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.FieldProduct }
     *     
     */
    public void setFieldProduct(Result.FieldProduct value) {
        this.fieldProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldImage() {
        return fieldImage;
    }

    /**
     * Define el valor de la propiedad fieldImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldImage(String value) {
        this.fieldImage = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldCategory.
     * 
     * @return
     *     possible object is
     *     {@link Result.FieldCategory }
     *     
     */
    public Result.FieldCategory getFieldCategory() {
        return fieldCategory;
    }

    /**
     * Define el valor de la propiedad fieldCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.FieldCategory }
     *     
     */
    public void setFieldCategory(Result.FieldCategory value) {
        this.fieldCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldTipo() {
        return fieldTipo;
    }

    /**
     * Define el valor de la propiedad fieldTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldTipo(String value) {
        this.fieldTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldFechaDeCreaciN.
     * 
     * @return
     *     possible object is
     *     {@link Result.FieldFechaDeCreaciN }
     *     
     */
    public Result.FieldFechaDeCreaciN getFieldFechaDeCreaciN() {
        return fieldFechaDeCreaciN;
    }

    /**
     * Define el valor de la propiedad fieldFechaDeCreaciN.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.FieldFechaDeCreaciN }
     *     
     */
    public void setFieldFechaDeCreaciN(Result.FieldFechaDeCreaciN value) {
        this.fieldFechaDeCreaciN = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldDescripciN.
     * 
     * @return
     *     possible object is
     *     {@link Result.FieldDescripciN }
     *     
     */
    public Result.FieldDescripciN getFieldDescripciN() {
        return fieldDescripciN;
    }

    /**
     * Define el valor de la propiedad fieldDescripciN.
     * 
     * @param value
     *     allowed object is
     *     {@link Result.FieldDescripciN }
     *     
     */
    public void setFieldDescripciN(Result.FieldDescripciN value) {
        this.fieldDescripciN = value;
    }

    /**
     * Obtiene el valor de la propiedad titleOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOriginal() {
        return titleOriginal;
    }

    /**
     * Define el valor de la propiedad titleOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOriginal(String value) {
        this.titleOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtiene el valor de la propiedad cid.
     * 
     */
    public byte getCid() {
        return cid;
    }

    /**
     * Define el valor de la propiedad cid.
     * 
     */
    public void setCid(byte value) {
        this.cid = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public int getLastCommentTimestamp() {
        return lastCommentTimestamp;
    }

    /**
     * Define el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public void setLastCommentTimestamp(int value) {
        this.lastCommentTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCommentName() {
        return lastCommentName;
    }

    /**
     * Define el valor de la propiedad lastCommentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCommentName(String value) {
        this.lastCommentName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentUid.
     * 
     */
    public byte getLastCommentUid() {
        return lastCommentUid;
    }

    /**
     * Define el valor de la propiedad lastCommentUid.
     * 
     */
    public void setLastCommentUid(byte value) {
        this.lastCommentUid = value;
    }

    /**
     * Obtiene el valor de la propiedad commentCount.
     * 
     */
    public byte getCommentCount() {
        return commentCount;
    }

    /**
     * Define el valor de la propiedad commentCount.
     * 
     */
    public void setCommentCount(byte value) {
        this.commentCount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     * 
     */
    public byte getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     */
    public void setPicture(byte value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldCategory {

        @XmlElement(required = true)
        protected Result.FieldCategory.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Result.FieldCategory.Und }
         *     
         */
        public Result.FieldCategory.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Result.FieldCategory.Und }
         *     
         */
        public void setUnd(Result.FieldCategory.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Result.FieldCategory.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Result.FieldCategory.Und.Item }
             *     
             */
            public Result.FieldCategory.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Result.FieldCategory.Und.Item }
             *     
             */
            public void setItem(Result.FieldCategory.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tid"
            })
            public static class Item {

                protected byte tid;

                /**
                 * Obtiene el valor de la propiedad tid.
                 * 
                 */
                public byte getTid() {
                    return tid;
                }

                /**
                 * Define el valor de la propiedad tid.
                 * 
                 */
                public void setTid(byte value) {
                    this.tid = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldDescripciN {

        @XmlElement(required = true)
        protected Result.FieldDescripciN.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Result.FieldDescripciN.Und }
         *     
         */
        public Result.FieldDescripciN.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Result.FieldDescripciN.Und }
         *     
         */
        public void setUnd(Result.FieldDescripciN.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Result.FieldDescripciN.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Result.FieldDescripciN.Und.Item }
             *     
             */
            public Result.FieldDescripciN.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Result.FieldDescripciN.Und.Item }
             *     
             */
            public void setItem(Result.FieldDescripciN.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value",
                "format",
                "safeValue"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String value;
                @XmlElement(required = true)
                protected String format;
                @XmlElement(name = "safe_value", required = true)
                protected String safeValue;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad format.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Define el valor de la propiedad format.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeValue() {
                    return safeValue;
                }

                /**
                 * Define el valor de la propiedad safeValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeValue(String value) {
                    this.safeValue = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="timezone_db" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="date_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldFechaDeCreaciN {

        @XmlElement(required = true)
        protected Result.FieldFechaDeCreaciN.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Result.FieldFechaDeCreaciN.Und }
         *     
         */
        public Result.FieldFechaDeCreaciN.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Result.FieldFechaDeCreaciN.Und }
         *     
         */
        public void setUnd(Result.FieldFechaDeCreaciN.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="timezone_db" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="date_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Result.FieldFechaDeCreaciN.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Result.FieldFechaDeCreaciN.Und.Item }
             *     
             */
            public Result.FieldFechaDeCreaciN.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Result.FieldFechaDeCreaciN.Und.Item }
             *     
             */
            public void setItem(Result.FieldFechaDeCreaciN.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="timezone_db" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="date_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value",
                "value2",
                "timezone",
                "timezoneDb",
                "dateType"
            })
            public static class Item {

                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar value;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar value2;
                @XmlElement(required = true)
                protected String timezone;
                @XmlElement(name = "timezone_db", required = true)
                protected String timezoneDb;
                @XmlElement(name = "date_type", required = true)
                protected String dateType;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setValue(XMLGregorianCalendar value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad value2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getValue2() {
                    return value2;
                }

                /**
                 * Define el valor de la propiedad value2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setValue2(XMLGregorianCalendar value) {
                    this.value2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad timezone.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimezone() {
                    return timezone;
                }

                /**
                 * Define el valor de la propiedad timezone.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimezone(String value) {
                    this.timezone = value;
                }

                /**
                 * Obtiene el valor de la propiedad timezoneDb.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimezoneDb() {
                    return timezoneDb;
                }

                /**
                 * Define el valor de la propiedad timezoneDb.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimezoneDb(String value) {
                    this.timezoneDb = value;
                }

                /**
                 * Obtiene el valor de la propiedad dateType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateType() {
                    return dateType;
                }

                /**
                 * Define el valor de la propiedad dateType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateType(String value) {
                    this.dateType = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldProduct {

        @XmlElement(required = true)
        protected Result.FieldProduct.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Result.FieldProduct.Und }
         *     
         */
        public Result.FieldProduct.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Result.FieldProduct.Und }
         *     
         */
        public void setUnd(Result.FieldProduct.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Result.FieldProduct.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Result.FieldProduct.Und.Item }
             *     
             */
            public Result.FieldProduct.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Result.FieldProduct.Und.Item }
             *     
             */
            public void setItem(Result.FieldProduct.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "productId"
            })
            public static class Item {

                @XmlElement(name = "product_id")
                protected byte productId;

                /**
                 * Obtiene el valor de la propiedad productId.
                 * 
                 */
                public byte getProductId() {
                    return productId;
                }

                /**
                 * Define el valor de la propiedad productId.
                 * 
                 */
                public void setProductId(byte value) {
                    this.productId = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="es">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "es"
    })
    public static class TitleField {

        @XmlElement(required = true)
        protected Result.TitleField.Es es;

        /**
         * Obtiene el valor de la propiedad es.
         * 
         * @return
         *     possible object is
         *     {@link Result.TitleField.Es }
         *     
         */
        public Result.TitleField.Es getEs() {
            return es;
        }

        /**
         * Define el valor de la propiedad es.
         * 
         * @param value
         *     allowed object is
         *     {@link Result.TitleField.Es }
         *     
         */
        public void setEs(Result.TitleField.Es value) {
            this.es = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Es {

            @XmlElement(required = true)
            protected Result.TitleField.Es.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Result.TitleField.Es.Item }
             *     
             */
            public Result.TitleField.Es.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Result.TitleField.Es.Item }
             *     
             */
            public void setItem(Result.TitleField.Es.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value",
                "format",
                "safeValue"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String value;
                @XmlElement(required = true)
                protected String format;
                @XmlElement(name = "safe_value", required = true)
                protected String safeValue;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad format.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Define el valor de la propiedad format.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeValue() {
                    return safeValue;
                }

                /**
                 * Define el valor de la propiedad safeValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeValue(String value) {
                    this.safeValue = value;
                }

            }

        }

    }

}
