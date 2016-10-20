/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.incubator.net.virtual;

import org.onlab.osgi.DefaultServiceDirectory;
import org.onlab.osgi.ServiceDirectory;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Basis for virtual network service.
 */
public abstract class AbstractVnetService
        implements VnetService {

    private static final String NETWORK_NULL = "Network ID cannot be null";

    protected NetworkId networkId;
    protected VirtualNetworkService manager;
    protected ServiceDirectory serviceDirectory;

    public AbstractVnetService(VirtualNetworkService manager,
                               NetworkId networkId) {
        checkNotNull(networkId, NETWORK_NULL);
        this.manager = manager;
        this.networkId = networkId;
        this.serviceDirectory = new DefaultServiceDirectory();
    }

    @Override
    public NetworkId networkId() {
        return this.networkId;
    }
}