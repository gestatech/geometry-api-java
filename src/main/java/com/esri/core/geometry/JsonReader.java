/*
 Copyright 1995-2015 Esri

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 For additional information, contact:
 Environmental Systems Research Institute, Inc.
 Attn: Contracts Dept
 380 New York Street
 Redlands, California, USA 92373

 email: contracts@esri.com
 */
package com.esri.core.geometry;

import java.util.ArrayList;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import org.codehaus.jackson.JsonParseException;

import java.io.IOException;

abstract class JsonReader {

	abstract JsonToken nextToken() throws JSONException, JsonParseException, IOException;

	abstract JsonToken currentToken() throws JSONException, JsonParseException, IOException;

	abstract void skipChildren() throws JSONException, JsonParseException, IOException;

	abstract String currentString() throws JSONException, JsonParseException, IOException;

	abstract double currentDoubleValue() throws JSONException, JsonParseException, IOException;

	abstract int currentIntValue() throws JSONException, JsonParseException, IOException;
}

