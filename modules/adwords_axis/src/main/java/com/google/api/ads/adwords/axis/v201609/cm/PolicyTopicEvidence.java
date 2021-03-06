// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * PolicyTopicEvidence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201609.cm;


/**
 * Evidence that caused this policy topic to be reported.
 */
public class PolicyTopicEvidence  implements java.io.Serializable {
    /* The type of evidence for the policy topic. */
    private com.google.api.ads.adwords.axis.v201609.cm.PolicyTopicEvidenceType policyTopicEvidenceType;

    /* The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT the
     *                 evidence is the text associated with the Ad. */
    private java.lang.String evidenceText;

    public PolicyTopicEvidence() {
    }

    public PolicyTopicEvidence(
           com.google.api.ads.adwords.axis.v201609.cm.PolicyTopicEvidenceType policyTopicEvidenceType,
           java.lang.String evidenceText) {
           this.policyTopicEvidenceType = policyTopicEvidenceType;
           this.evidenceText = evidenceText;
    }


    /**
     * Gets the policyTopicEvidenceType value for this PolicyTopicEvidence.
     * 
     * @return policyTopicEvidenceType   * The type of evidence for the policy topic.
     */
    public com.google.api.ads.adwords.axis.v201609.cm.PolicyTopicEvidenceType getPolicyTopicEvidenceType() {
        return policyTopicEvidenceType;
    }


    /**
     * Sets the policyTopicEvidenceType value for this PolicyTopicEvidence.
     * 
     * @param policyTopicEvidenceType   * The type of evidence for the policy topic.
     */
    public void setPolicyTopicEvidenceType(com.google.api.ads.adwords.axis.v201609.cm.PolicyTopicEvidenceType policyTopicEvidenceType) {
        this.policyTopicEvidenceType = policyTopicEvidenceType;
    }


    /**
     * Gets the evidenceText value for this PolicyTopicEvidence.
     * 
     * @return evidenceText   * The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT the
     *                 evidence is the text associated with the Ad.
     */
    public java.lang.String getEvidenceText() {
        return evidenceText;
    }


    /**
     * Sets the evidenceText value for this PolicyTopicEvidence.
     * 
     * @param evidenceText   * The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT the
     *                 evidence is the text associated with the Ad.
     */
    public void setEvidenceText(java.lang.String evidenceText) {
        this.evidenceText = evidenceText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTopicEvidence)) return false;
        PolicyTopicEvidence other = (PolicyTopicEvidence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyTopicEvidenceType==null && other.getPolicyTopicEvidenceType()==null) || 
             (this.policyTopicEvidenceType!=null &&
              this.policyTopicEvidenceType.equals(other.getPolicyTopicEvidenceType()))) &&
            ((this.evidenceText==null && other.getEvidenceText()==null) || 
             (this.evidenceText!=null &&
              this.evidenceText.equals(other.getEvidenceText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPolicyTopicEvidenceType() != null) {
            _hashCode += getPolicyTopicEvidenceType().hashCode();
        }
        if (getEvidenceText() != null) {
            _hashCode += getEvidenceText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTopicEvidence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "PolicyTopicEvidence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEvidenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "policyTopicEvidenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "PolicyTopicEvidenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evidenceText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "evidenceText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
