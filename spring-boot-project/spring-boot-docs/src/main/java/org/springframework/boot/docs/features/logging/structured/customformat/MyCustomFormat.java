/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.docs.features.logging.structured.customformat;

import ch.qos.logback.classic.spi.ILoggingEvent;

import org.springframework.boot.logging.structured.StructuredLogFormatter;

class MyCustomFormat implements StructuredLogFormatter<ILoggingEvent> {

	@Override
	public String format(ILoggingEvent event) {
		return "time=" + event.getInstant() + " level=" + event.getLevel() + " message=" + event.getMessage() + "\n";
	}

}
