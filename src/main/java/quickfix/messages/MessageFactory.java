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

import quickfix.Group;
import quickfix.Message;

public class MessageFactory implements quickfix.MessageFactory {

    public Message create(String beginString, String msgType) {

        switch (msgType) {

            case Heartbeat.MSGTYPE:
                return new Heartbeat();

            case Logon.MSGTYPE:
                return new Logon();

            case AutionMatch.MSGTYPE:
                return new AutionMatch();

            case BoardInfo.MSGTYPE:
                return new BoardInfo();

            case DerivativesInfo.MSGTYPE:
                return new DerivativesInfo();

            case Index.MSGTYPE:
                return new Index();

            case Stock.MSGTYPE:
                return new Stock();

            case StockInfo.MSGTYPE:
                return new StockInfo();

            case TopNPrice.MSGTYPE:
                return new TopNPrice();

            case TopPriceOddLot.MSGTYPE:
                return new TopPriceOddLot();

        }

        return new quickfix.messages.Message();
    }

    public Group create(String beginString, String msgType, int correspondingFieldID) {

        switch (msgType) {

            case TopNPrice.MSGTYPE:
                switch (correspondingFieldID) {

                    case quickfix.fields.NoTopPrice.FIELD:
                        return new TopNPrice.NoTopPrice();

                }
                break;

        }

        return null;
    }
}
