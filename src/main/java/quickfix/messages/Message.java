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
package quickfix.messages;

import quickfix.FieldNotFound;
import quickfix.field.BeginString;


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

        public void set(quickfix.fields.BeginString value) {
            setField(value);
        }

        public quickfix.fields.BeginString get(quickfix.fields.BeginString value) throws FieldNotFound {
            getField(value);
            return value;
        }

        public quickfix.fields.BeginString getBeginString() throws FieldNotFound {
            return get(new quickfix.fields.BeginString());
        }

        public boolean isSet(quickfix.fields.BeginString field) {
            return isSetField(field);
        }

        public boolean isSetBeginString() {
            return isSetField(8);
        }

        public void set(quickfix.fields.BodyLength value) {
            setField(value);
        }

        public quickfix.fields.BodyLength get(quickfix.fields.BodyLength value) throws FieldNotFound {
            getField(value);
            return value;
        }

        public quickfix.fields.BodyLength getBodyLength() throws FieldNotFound {
            return get(new quickfix.fields.BodyLength());
        }

        public boolean isSet(quickfix.fields.BodyLength field) {
            return isSetField(field);
        }

        public boolean isSetBodyLength() {
            return isSetField(9);
        }

        public void set(quickfix.fields.MsgType value) {
            setField(value);
        }

        public quickfix.fields.MsgType get(quickfix.fields.MsgType value) throws FieldNotFound {
            getField(value);
            return value;
        }

        public quickfix.fields.MsgType getMsgType() throws FieldNotFound {
            return get(new quickfix.fields.MsgType());
        }

        public boolean isSet(quickfix.fields.MsgType field) {
            return isSetField(field);
        }

        public boolean isSetMsgType() {
            return isSetField(35);
        }

        public void set(quickfix.fields.SenderCompID value) {
            setField(value);
        }

        public quickfix.fields.SenderCompID get(quickfix.fields.SenderCompID value) throws FieldNotFound {
            getField(value);
            return value;
        }

        public quickfix.fields.SenderCompID getSenderCompID() throws FieldNotFound {
            return get(new quickfix.fields.SenderCompID());
        }

        public boolean isSet(quickfix.fields.SenderCompID field) {
            return isSetField(field);
        }

        public boolean isSetSenderCompID() {
            return isSetField(49);
        }

        public void set(quickfix.fields.SendingTime value) {
            setField(value);
        }

        public quickfix.fields.SendingTime get(quickfix.fields.SendingTime value) throws FieldNotFound {
            getField(value);
            return value;
        }

        public quickfix.fields.SendingTime getSendingTime() throws FieldNotFound {
            return get(new quickfix.fields.SendingTime());
        }

        public boolean isSet(quickfix.fields.SendingTime field) {
            return isSetField(field);
        }

        public boolean isSetSendingTime() {
            return isSetField(52);
        }

    }


    public void set(quickfix.fields.SignatureLength value) {
        setField(value);
    }

    public quickfix.fields.SignatureLength get(quickfix.fields.SignatureLength value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.SignatureLength getSignatureLength() throws FieldNotFound {
        return get(new quickfix.fields.SignatureLength());
    }

    public boolean isSet(quickfix.fields.SignatureLength field) {
        return isSetField(field);
    }

    public boolean isSetSignatureLength() {
        return isSetField(93);
    }

    public void set(quickfix.fields.Signature value) {
        setField(value);
    }

    public quickfix.fields.Signature get(quickfix.fields.Signature value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.Signature getSignature() throws FieldNotFound {
        return get(new quickfix.fields.Signature());
    }

    public boolean isSet(quickfix.fields.Signature field) {
        return isSetField(field);
    }

    public boolean isSetSignature() {
        return isSetField(89);
    }

    public void set(quickfix.fields.CheckSum value) {
        setField(value);
    }

    public quickfix.fields.CheckSum get(quickfix.fields.CheckSum value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.CheckSum getCheckSum() throws FieldNotFound {
        return get(new quickfix.fields.CheckSum());
    }

    public boolean isSet(quickfix.fields.CheckSum field) {
        return isSetField(field);
    }

    public boolean isSetCheckSum() {
        return isSetField(10);
    }

}
