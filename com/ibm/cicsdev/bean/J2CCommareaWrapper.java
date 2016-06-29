/* Licensed Materials - Property of IBM                                   */
package com.ibm.cicsdev.bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.*;
import com.ibm.etools.marshall.util.*;

/**
 * @generated
 * Generated Class: DFHCOMMAREA
 * @type-descriptor.aggregate-instance-td accessor="readWrite" contentSize="104" offset="0" size="104"
 * @type-descriptor.platform-compiler-info language="COBOL" defaultBigEndian="true" defaultCodepage="IBM-1047" defaultExternalDecimalSign="ebcdic" defaultFloatType="ibm390Hex"
 */

public class J2CCommareaWrapper implements javax.resource.cci.Record,
		javax.resource.cci.Streamable, com.ibm.etools.marshall.RecordBytes {
	private static final long serialVersionUID = -235000278942933479L;
	/**
	 * @generated
	 */
	private byte[] buffer_ = null;
	/**
	 * @generated
	 */
	private static final int bufferSize_;
	/**
	 * @generated
	 */
	private static final byte[] initializedBuffer_;
	/**
	 * @generated
	 */
	private static java.util.HashMap getterMap_ = null;
	/**
	 * @generated
	 */
	private java.util.HashMap valFieldNameMap_ = null;
	/**
	 * @generated
	 */
	public static final BigDecimal BD_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_DOT_NINE_NINE_NINE = new BigDecimal(
			"999999999999.999");
	/**
	 * initializer
	 * @generated
	 */
	static {
		bufferSize_ = 104;
		initializedBuffer_ = new byte[bufferSize_];
		String character__stringInitialValue = " ";
		MarshallStringUtils.marshallFixedLengthStringIntoBuffer(
				character__stringInitialValue, initializedBuffer_, 2,
				"IBM-1047", 30, MarshallStringUtils.STRING_JUSTIFICATION_LEFT,
				" ");
		String boolInitialValue = " ";
		MarshallStringUtils.marshallFixedLengthStringIntoBuffer(
				boolInitialValue, initializedBuffer_, 73, "IBM-1047", 1,
				MarshallStringUtils.STRING_JUSTIFICATION_LEFT, " ");
		String result__textInitialValue = " ";
		MarshallStringUtils.marshallFixedLengthStringIntoBuffer(
				result__textInitialValue, initializedBuffer_, 79, "IBM-1047",
				25, MarshallStringUtils.STRING_JUSTIFICATION_LEFT, " ");
	}

	/**
	 * constructor
	 * @generated
	 */
	public J2CCommareaWrapper() {
		initialize();
	}

	/**
	 * constructor
	 * @generated
	 */
	public J2CCommareaWrapper(java.util.HashMap valFieldNameMap) {
		valFieldNameMap_ = valFieldNameMap;
		initialize();
	}

	/**
	 * @generated
	 * initialize
	 */
	public void initialize() {
		buffer_ = new byte[bufferSize_];
		System.arraycopy(initializedBuffer_, 0, buffer_, 0, bufferSize_);
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Streamable#read(java.io.InputStream)
	 */
	public void read(java.io.InputStream inputStream)
			throws java.io.IOException {
		byte[] input = new byte[inputStream.available()];
		inputStream.read(input);
		buffer_ = input;
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Streamable#write(java.io.OutputStream)
	 */
	public void write(java.io.OutputStream outputStream)
			throws java.io.IOException {
		outputStream.write(buffer_, 0, getSize());
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#getRecordName()
	 */
	public String getRecordName() {
		return (this.getClass().getName());
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#setRecordName(String)
	 */
	public void setRecordName(String recordName) {
		return;
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#setRecordShortDescription(String)
	 */
	public void setRecordShortDescription(String shortDescription) {
		return;
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#getRecordShortDescription()
	 */
	public String getRecordShortDescription() {
		return (this.getClass().getName());
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#clone()
	 */
	public Object clone() throws CloneNotSupportedException {
		return (super.clone());
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#equals
	 */
	public boolean equals(Object object) {
		return (super.equals(object));
	}

	/**
	 * @generated
	 * @see javax.resource.cci.Record#hashCode
	 */
	public int hashCode() {
		return (super.hashCode());
	}

	/**
	 * @generated
	 * @see com.ibm.etools.marshall.RecordBytes#getBytes
	 */
	public byte[] getBytes() {
		return (buffer_);
	}

	/**
	 * @generated
	 * @see com.ibm.etools.marshall.RecordBytes#setBytes
	 */
	public void setBytes(byte[] bytes) {
		if ((bytes != null) && (bytes.length != 0))
			buffer_ = bytes;
	}

	/**
	 * @generated
	 * @see com.ibm.etools.marshall.RecordBytes#getSize
	 */
	public int getSize() {
		return (104);
	}

	/**
	 * @generated
	 */
	public boolean match(Object obj) {
		if (obj == null)
			return (false);
		if (obj.getClass().isArray()) {
			byte[] currBytes = buffer_;
			try {
				byte[] objByteArray = (byte[]) obj;
				if (objByteArray.length != buffer_.length)
					return (false);
				buffer_ = objByteArray;
			} catch (ClassCastException exc) {
				return (false);
			} finally {
				buffer_ = currBytes;
			}
		} else
			return (false);
		return (true);
	}

	/**
	 * @generated
	 */
	public void populate(Object obj) {
		if (obj.getClass().isArray()) {
			try {
				buffer_ = (byte[]) obj;
			} catch (ClassCastException exc) {
			}
		}
	}

	/**
	 * @generated
	 * @see java.lang.Object#toString
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append("\n");
		ConversionUtils.dumpBytes(sb, buffer_);
		return (sb.toString());
	}

	/**
	 * @generated
	 * wrappedGetNumber
	 */
	public Number wrappedGetNumber(String propertyName) {
		Number result = null;

		if (getterMap_ == null) {
			synchronized (initializedBuffer_) {
				if (getterMap_ == null) {
					java.util.HashMap getterMap = new java.util.HashMap();
					try {
						BeanInfo info = Introspector.getBeanInfo(this
								.getClass());
						PropertyDescriptor[] props = info
								.getPropertyDescriptors();

						for (int i = 0; i < props.length; i++) {
							String propName = props[i].getName();
							getterMap.put(propName, props[i].getReadMethod());
						}
					} catch (IntrospectionException exc) {
					}
					getterMap_ = getterMap;
				}
			}
		}

		Method method = (Method) getterMap_.get(propertyName);
		if (method != null) {
			try {
				result = (Number) method.invoke(this, new Object[0]);
			} catch (Exception exc) {
			}
		}

		return (result);
	}

	/**
	 * @generated
	 * evaluateMap
	 */
	public java.util.HashMap evaluateMap(java.util.HashMap valFieldNameMap) {
		if (valFieldNameMap == null)
			return (null);
		java.util.HashMap returnMap = new java.util.HashMap(
				valFieldNameMap.size());
		java.util.Set aSet = valFieldNameMap.entrySet();

		for (java.util.Iterator cursor = aSet.iterator(); cursor.hasNext();) {
			java.util.Map.Entry element = (java.util.Map.Entry) cursor.next();
			String key = (String) element.getKey();
			String fieldName = (String) element.getValue();
			Number fieldValue = wrappedGetNumber(fieldName);
			if (fieldValue == null)
				fieldValue = new Integer(0);
			returnMap.put(key, fieldValue);
		}

		return (returnMap);
	}

	/**
	 * @generated
	 * Returns the integer value of the formula string for an offset or size.
	 * The formula can be comprised of the following functions:
	 * neg(x)   := -x       // prefix negate
	 * add(x,y) := x+y      // infix add
	 * sub(x,y) := x-y      // infix subtract
	 * mpy(x,y) := x*y      // infix multiply
	 * div(x,y) := x/y      // infix divide
	 * max(x,y) := max(x,y)
	 * min(x,y) := min(x,y)
	 *
	 * mod(x,y) := x mod y
	 *
	 * The mod function is defined as mod(x,y) = r where r is the smallest non-negative integer
	 * such that x-r is evenly divisible by y. So mod(7,4) is 3, but mod(-7,4) is 1. If y is a
	 * power of 2, then mod(x,y) is equal to the bitwise-and of x and y-1.
	 *
	 * val(1, m, n, o,..)
	 *
	 * The val function returns the value of a field in the model. The val function takes one
	 * or more arguments, and the first argument refers to a level-1 field in the type model and must be either:
	 *    - the name of a level-1 field described in the language model
	 *    - the integer 1 (indicating that the level-1 parent of the current structure is meant)
	 * If the first argument to the val function is the integer 1, then and only then are subsequent arguments
	 * permitted. These subsequent arguments are integers that the specify the ordinal number within its
	 * substructure of the subfield that should be dereferenced.
	 *
	 * @return The integer value of the formula string for an offset or size.
	 * @param formula The formula to be evaluated.
	 * @param valFieldNameMap A map of val() formulas to field names.
	 * @throws IllegalArgumentException if the formula is null.
	 */

	public int evaluateFormula(String formula, java.util.HashMap valFieldNameMap)
			throws IllegalArgumentException {
		if (formula == null)
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.MARSHRT_FORMULA_NULL));

		int result = 0;

		int index = formula.indexOf("(");

		if (index == -1) // It's a number not an expression
		{
			try {
				result = Integer.parseInt(formula);
			} catch (Exception exc) {
			}

			return (result);
		}

		// Determine the outermost function
		String function = formula.substring(0, index);

		if (function.equalsIgnoreCase("val")) {
			Object field = valFieldNameMap.get(formula);
			if (field == null)
				return (0);

			if (field instanceof String) {
				Number num = wrappedGetNumber((String) field);
				if (num == null) // Element does not exist
					return (0);
				result = num.intValue();
			} else if (field instanceof Number)
				result = ((Number) field).intValue();
			else
				return (0);

			return (result);
		} else if (function.equalsIgnoreCase("neg")) {
			// The new formula is the content between the brackets
			formula = formula.substring(index + 1, formula.length() - 1);
			result = -1 * evaluateFormula(formula, valFieldNameMap);
			return (result);
		} else {
			// Get the contents between the outermost brackets
			formula = formula.substring(index + 1, formula.length() - 1);
			char[] formulaChars = formula.toCharArray();

			// Get the left side and the right side of the operation

			int brackets = 0;
			int i = 0;

			for (; i < formulaChars.length; i++) {
				if (formulaChars[i] == '(')
					brackets++;
				else if (formulaChars[i] == ')')
					brackets--;
				else if (formulaChars[i] == ',') {
					if (brackets == 0)
						break;
				}
			}

			String leftSide = "0";
			String rightSide = "0";

			leftSide = formula.substring(0, i);
			rightSide = formula.substring(i + 1);

			if (function.equalsIgnoreCase("add"))
				result = evaluateFormula(leftSide, valFieldNameMap)
						+ evaluateFormula(rightSide, valFieldNameMap);
			else if (function.equalsIgnoreCase("mpy"))
				result = evaluateFormula(leftSide, valFieldNameMap)
						* evaluateFormula(rightSide, valFieldNameMap);
			else if (function.equalsIgnoreCase("sub"))
				result = evaluateFormula(leftSide, valFieldNameMap)
						- evaluateFormula(rightSide, valFieldNameMap);
			else if (function.equalsIgnoreCase("div"))
				result = evaluateFormula(leftSide, valFieldNameMap)
						/ evaluateFormula(rightSide, valFieldNameMap);
			else if (function.equalsIgnoreCase("max"))
				result = Math.max(evaluateFormula(leftSide, valFieldNameMap),
						evaluateFormula(rightSide, valFieldNameMap));
			else if (function.equalsIgnoreCase("min"))
				result = Math.min(evaluateFormula(leftSide, valFieldNameMap),
						evaluateFormula(rightSide, valFieldNameMap));
			else if (function.equalsIgnoreCase("mod"))
				result = evaluateFormula(leftSide, valFieldNameMap)
						% evaluateFormula(rightSide, valFieldNameMap);
		}

		return (result);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="0" upperBound="9999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="2" offset="0" size="2"
	 * @type-descriptor.integer-td signed="false" signCoding="unsignedBinary"
	 */
	public short getBinary__digit() {
		short binary__digit = 0;
		binary__digit = MarshallIntegerUtils
				.unmarshallTwoByteIntegerFromBuffer(buffer_, 0, true,
						MarshallIntegerUtils.SIGN_CODING_UNSIGNED_BINARY);
		return (binary__digit);
	}

	/**
	 * @generated
	 */
	public void setBinary__digit(short binary__digit) {
		if ((binary__digit < 0) || (binary__digit > 9999))
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.IWAA0127E,
							Short.toString(binary__digit), "binary__digit",
							"0", "9999"));
		MarshallIntegerUtils.marshallTwoByteIntegerIntoBuffer(binary__digit,
				buffer_, 0, true,
				MarshallIntegerUtils.SIGN_CODING_UNSIGNED_BINARY);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction maxLength="30"
	 * @type-descriptor.initial-value kind="SPACE"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="30" offset="2" size="30"
	 * @type-descriptor.string-td characterSize="1" lengthEncoding="fixedLength" paddingCharacter=" " prefixLength="0"
	 */
	public String getCharacter__string() {
		String character__string = null;
		character__string = MarshallStringUtils
				.unmarshallFixedLengthStringFromBuffer(buffer_, 2, "IBM-1047",
						30);
		return (character__string);
	}

	/**
	 * @generated
	 */
	public void setCharacter__string(String character__string) {
		if (character__string != null) {
			if (character__string.length() > 30)
				throw new IllegalArgumentException(MarshallResource.instance()
						.getString(MarshallResource.IWAA0124E,
								character__string, "30", "character__string"));
			MarshallStringUtils.marshallFixedLengthStringIntoBuffer(
					character__string, buffer_, 2, "IBM-1047", 30,
					MarshallStringUtils.STRING_JUSTIFICATION_LEFT, " ");
		}
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="0" upperBound="999999999999999999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="18" offset="32" size="18"
	 * @type-descriptor.external-decimal-td signed="false" signFormat="trailing"
	 */
	public long getNumeric__string() {
		long numeric__string = 0;
		numeric__string = MarshallExternalDecimalUtils
				.unmarshallLongFromBuffer(
						buffer_,
						32,
						18,
						false,
						-1,
						MarshallExternalDecimalUtils.EXTERNAL_DECIMAL_SIGN_EBCDIC);
		return (numeric__string);
	}

	/**
	 * @generated
	 */
	public void setNumeric__string(long numeric__string) {
		if ((numeric__string < 0L) || (numeric__string > 999999999999999999L))
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.IWAA0127E,
							Long.toString(numeric__string), "numeric__string",
							"0", "999999999999999999"));
		MarshallExternalDecimalUtils.marshallExternalDecimalIntoBuffer(
				numeric__string, buffer_, 32, 18, false, -1,
				MarshallExternalDecimalUtils.EXTERNAL_DECIMAL_SIGN_EBCDIC);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="0" upperBound="999999999999999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="8" offset="50" size="8"
	 * @type-descriptor.packed-decimal-td signed="false"
	 */
	public long getPacked__digit() {
		long packed__digit = 0;
		packed__digit = MarshallPackedDecimalUtils.unmarshallLongFromBuffer(
				buffer_, 50, 8);
		return (packed__digit);
	}

	/**
	 * @generated
	 */
	public void setPacked__digit(long packed__digit) {
		if ((packed__digit < 0L) || (packed__digit > 999999999999999L))
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.IWAA0127E,
							Long.toString(packed__digit), "packed__digit", "0",
							"999999999999999"));
		MarshallPackedDecimalUtils.marshallPackedDecimalIntoBuffer(
				packed__digit, buffer_, 50, 8, false);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="0" upperBound="999999999999.999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="8" offset="58" size="8"
	 * @type-descriptor.packed-decimal-td signed="false" virtualDecimalPoint="3"
	 */
	public BigDecimal getPacked__digit__with__comma() {
		BigDecimal packed__digit__with__comma = null;
		packed__digit__with__comma = MarshallPackedDecimalUtils
				.unmarshallBigDecimalFromBuffer(buffer_, 58, 8, 3);
		return (packed__digit__with__comma);
	}

	/**
	 * @generated
	 */
	public void setPacked__digit__with__comma(
			BigDecimal packed__digit__with__comma) {
		if (packed__digit__with__comma != null) {
			if ((packed__digit__with__comma.compareTo(BigDecimal.ZERO) == -1)
					|| (packed__digit__with__comma
							.compareTo(BD_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_NINE_DOT_NINE_NINE_NINE) == 1))
				throw new IllegalArgumentException(MarshallResource.instance()
						.getString(MarshallResource.IWAA0127E,
								packed__digit__with__comma.toString(),
								"packed__digit__with__comma", "0",
								"999999999999.999"));
			MarshallPackedDecimalUtils.marshallPackedDecimalIntoBuffer(
					packed__digit__with__comma, buffer_, 58, 8, false, 3);
		}
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="-999999999999" upperBound="999999999999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="7" offset="66" size="7"
	 * @type-descriptor.packed-decimal-td
	 */
	public long getSigned__packed() {
		long signed__packed = 0;
		signed__packed = MarshallPackedDecimalUtils.unmarshallLongFromBuffer(
				buffer_, 66, 7);
		return (signed__packed);
	}

	/**
	 * @generated
	 */
	public void setSigned__packed(long signed__packed) {
		if ((signed__packed < -999999999999L)
				|| (signed__packed > 999999999999L))
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.IWAA0127E,
							Long.toString(signed__packed), "signed__packed",
							"-999999999999", "999999999999"));
		MarshallPackedDecimalUtils.marshallPackedDecimalIntoBuffer(
				signed__packed, buffer_, 66, 7, true);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction maxLength="1"
	 * @type-descriptor.initial-value kind="SPACE"
	 * @type-descriptor.level88 name="bool__true" value="? THRU \u00ff"
	 * @type-descriptor.level88 name="bool__false" value="?"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="1" offset="73" size="1"
	 * @type-descriptor.string-td characterSize="1" lengthEncoding="fixedLength" paddingCharacter=" " prefixLength="0"
	 */
	public String getBool() {
		String bool = null;
		bool = MarshallStringUtils.unmarshallFixedLengthStringFromBuffer(
				buffer_, 73, "IBM-1047", 1);
		return (bool);
	}

	/**
	 * @generated
	 */
	public void setBool(String bool) {
		if (bool != null) {
			if (bool.length() > 1)
				throw new IllegalArgumentException(MarshallResource.instance()
						.getString(MarshallResource.IWAA0124E, bool, "1",
								"bool"));
			MarshallStringUtils.marshallFixedLengthStringIntoBuffer(bool,
					buffer_, 73, "IBM-1047", 1,
					MarshallStringUtils.STRING_JUSTIFICATION_LEFT, " ");
		}
	}

	/**
	 * @generated
	 */
	public static String getBool__true() {
		return ("?");
	}

	/**
	 * @generated
	 */
	public static boolean isBool__true(String bool__true) {
		return (com.ibm.etools.marshall.util.StringRange.isInRange("?",
				"\u00ff", bool__true));
	}

	/**
	 * @generated
	 */
	public static String getBool__false() {
		return ("?");
	}

	/**
	 * @generated
	 */
	public static boolean isBool__false(String bool__false) {
		return ("?".equals(bool__false));
	}

	/**
	 * @generated
	 * @type-descriptor.restriction lowerBound="-99999" upperBound="99999"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="5" offset="74" size="5"
	 * @type-descriptor.external-decimal-td signFormat="trailing"
	 */
	public int getResult__code() {
		int result__code = 0;
		result__code = MarshallExternalDecimalUtils.unmarshallIntFromBuffer(
				buffer_, 74, 5, true,
				MarshallExternalDecimalUtils.SIGN_FORMAT_TRAILING,
				MarshallExternalDecimalUtils.EXTERNAL_DECIMAL_SIGN_EBCDIC);
		return (result__code);
	}

	/**
	 * @generated
	 */
	public void setResult__code(int result__code) {
		if ((result__code < -99999) || (result__code > 99999))
			throw new IllegalArgumentException(MarshallResource.instance()
					.getString(MarshallResource.IWAA0127E,
							Integer.toString(result__code), "result__code",
							"-99999", "99999"));
		MarshallExternalDecimalUtils.marshallExternalDecimalIntoBuffer(
				result__code, buffer_, 74, 5, true,
				MarshallExternalDecimalUtils.SIGN_FORMAT_TRAILING,
				MarshallExternalDecimalUtils.EXTERNAL_DECIMAL_SIGN_EBCDIC);
	}

	/**
	 * @generated
	 * @type-descriptor.restriction maxLength="25"
	 * @type-descriptor.initial-value kind="SPACE"
	 * @type-descriptor.simple-instance-td accessor="readWrite" contentSize="25" offset="79" size="25"
	 * @type-descriptor.string-td characterSize="1" lengthEncoding="fixedLength" paddingCharacter=" " prefixLength="0"
	 */
	public String getResult__text() {
		String result__text = null;
		result__text = MarshallStringUtils
				.unmarshallFixedLengthStringFromBuffer(buffer_, 79, "IBM-1047",
						25);
		return (result__text);
	}

	/**
	 * @generated
	 */
	public void setResult__text(String result__text) {
		if (result__text != null) {
			if (result__text.length() > 25)
				throw new IllegalArgumentException(MarshallResource.instance()
						.getString(MarshallResource.IWAA0124E, result__text,
								"25", "result__text"));
			MarshallStringUtils.marshallFixedLengthStringIntoBuffer(
					result__text, buffer_, 79, "IBM-1047", 25,
					MarshallStringUtils.STRING_JUSTIFICATION_LEFT, " ");
		}
	}

}