/*
 * Copyright 2015-2019 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.shetland.ogc.wps;

import java.util.Optional;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public enum ExecutionMode {
    SYNC,
    ASYNC,
    STEP, //mingda zhang. for time-step based computation mode
    AUTO;

    public static Optional<ExecutionMode> fromString(String string) {
        for (ExecutionMode t : values()) {
            if (t.name().equalsIgnoreCase(string)) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}
