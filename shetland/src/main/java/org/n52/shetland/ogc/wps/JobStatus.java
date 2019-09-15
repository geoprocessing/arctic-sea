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

import java.util.Objects;

import com.google.common.base.Strings;

/**
 * add more states for environmental model execution
 * @author mingda zhang
 */
/**
 * Basic status set to communicate the status of a server-side job to the
 * client. Extensions of this specification may introduce additional states for
 * fine-grained monitoring or domain-specific purposes.
 *
 * @author Christian Autermann
 */
public class JobStatus {

    /**
     * The job has finished with no errors.
     */
    private static final JobStatus SUCCEEDED = new JobStatus("Succeeded");
    /**
     * The job has finished with errors.
     */
    private static final JobStatus FAILED = new JobStatus("Failed");
    /**
     * The job is queued for execution.
     */
    private static final JobStatus ACCEPTED = new JobStatus("Accepted");
    /**
     * The job is running.
     */
    private static final JobStatus RUNNING = new JobStatus("Running");

    private final String value;

    /**
     * states for model execution. mingda
     */
    private static final JobStatus INITIALIZING = new JobStatus("Initializing");
    private static final JobStatus INITIALIZED = new JobStatus("Initialized");
    private static final JobStatus UPDATING = new JobStatus("Updating");
    private static final JobStatus UPDATED = new JobStatus("Updated");
    private static final JobStatus DONE = new JobStatus("Done");
    private static final JobStatus FINISHING = new JobStatus("Finishing");

    public JobStatus(String value) {
        this.value = Objects.requireNonNull(Strings.emptyToNull(value));
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JobStatus other = (JobStatus) obj;
        return Objects.equals(this.value, other.getValue());
    }

    public String getValue() {
        return value;
    }

    public static JobStatus succeeded() {
        return SUCCEEDED;
    }

    public static JobStatus failed() {
        return FAILED;
    }

    public static JobStatus accepted() {
        return ACCEPTED;
    }

    public static JobStatus running() {
        return RUNNING;
    }

    public static JobStatus initializing() {
        return INITIALIZING;
    }

    public static JobStatus initialized() {
        return INITIALIZED;
    }

    public static JobStatus updating() {
        return UPDATING;
    }

    public static JobStatus updated() {
        return UPDATED;
    }

    public static JobStatus done() {
        return DONE;
    }

    public static JobStatus finishing() {
        return FINISHING;
    }

}
