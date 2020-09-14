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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case custom.messages.Heartbeat.MSGTYPE:
				return new custom.messages.Heartbeat();
	
			case custom.messages.Logon.MSGTYPE:
				return new custom.messages.Logon();
	
			case custom.messages.AutionMatch.MSGTYPE:
				return new custom.messages.AutionMatch();
	
			case custom.messages.BoardInfo.MSGTYPE:
				return new custom.messages.BoardInfo();
	
			case custom.messages.DerivativesInfo.MSGTYPE:
				return new custom.messages.DerivativesInfo();
	
			case custom.messages.Index.MSGTYPE:
				return new custom.messages.Index();
	
			case custom.messages.Stock.MSGTYPE:
				return new custom.messages.Stock();
	
			case custom.messages.StockInfo.MSGTYPE:
				return new custom.messages.StockInfo();
	
			case custom.messages.TopNPrice.MSGTYPE:
				return new custom.messages.TopNPrice();
	
			case custom.messages.TopPriceOddLot.MSGTYPE:
				return new custom.messages.TopPriceOddLot();
	
		}

		return new custom.messages.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case custom.messages.TopNPrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case custom.fields.NoTopPrice.FIELD:
					return new custom.messages.TopNPrice.NoTopPrice();
	
				}
				break;
	
		}

		return null;
	}
}
