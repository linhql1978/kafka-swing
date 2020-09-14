/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/
package custom.messages;

import quickfix.FieldNotFound;
  
import quickfix.field.*;


public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

    @Override
    protected Header newHeader() {
        return new Header(this);
    }

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(custom.fields.BeginString value) {
		setField(value);
	}

	public custom.fields.BeginString get(custom.fields.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BeginString getBeginString() throws FieldNotFound {
		return get(new custom.fields.BeginString());
	}

	public boolean isSet(custom.fields.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(custom.fields.BodyLength value) {
		setField(value);
	}

	public custom.fields.BodyLength get(custom.fields.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BodyLength getBodyLength() throws FieldNotFound {
		return get(new custom.fields.BodyLength());
	}

	public boolean isSet(custom.fields.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(custom.fields.MsgType value) {
		setField(value);
	}

	public custom.fields.MsgType get(custom.fields.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.MsgType getMsgType() throws FieldNotFound {
		return get(new custom.fields.MsgType());
	}

	public boolean isSet(custom.fields.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(custom.fields.SenderCompID value) {
		setField(value);
	}

	public custom.fields.SenderCompID get(custom.fields.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new custom.fields.SenderCompID());
	}

	public boolean isSet(custom.fields.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(custom.fields.SendingTime value) {
		setField(value);
	}

	public custom.fields.SendingTime get(custom.fields.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SendingTime getSendingTime() throws FieldNotFound {
		return get(new custom.fields.SendingTime());
	}

	public boolean isSet(custom.fields.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	}
	
	
	public void set(custom.fields.SignatureLength value) {
		setField(value);
	}

	public custom.fields.SignatureLength get(custom.fields.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new custom.fields.SignatureLength());
	}

	public boolean isSet(custom.fields.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(custom.fields.Signature value) {
		setField(value);
	}

	public custom.fields.Signature get(custom.fields.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Signature getSignature() throws FieldNotFound {
		return get(new custom.fields.Signature());
	}

	public boolean isSet(custom.fields.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(custom.fields.CheckSum value) {
		setField(value);
	}

	public custom.fields.CheckSum get(custom.fields.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CheckSum getCheckSum() throws FieldNotFound {
		return get(new custom.fields.CheckSum());
	}

	public boolean isSet(custom.fields.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
