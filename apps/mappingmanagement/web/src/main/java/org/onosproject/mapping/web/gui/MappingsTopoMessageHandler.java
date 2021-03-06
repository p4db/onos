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
package org.onosproject.mapping.web.gui;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.ImmutableSet;
import org.onosproject.ui.RequestHandler;
import org.onosproject.ui.UiMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * Mapping management UI topology-overlay message handler.
 */
public class MappingsTopoMessageHandler extends UiMessageHandler {

    private static final String MAPPINGS_TOPO_DISPLAY_START = "mappingsTopoDisplayStart";
    private static final String MAPPINGS_TOPO_DISPLAY_STOP = "mappingsTopoDisplayStop";

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected Collection<RequestHandler> createRequestHandlers() {
        return ImmutableSet.of(
                new DisplayStartHandler(),
                new DisplayStopHandler()
        );
    }

    private final class DisplayStartHandler extends RequestHandler {

        public DisplayStartHandler() {
            super(MAPPINGS_TOPO_DISPLAY_START);
        }

        @Override
        public void process(ObjectNode payload) {
            log.debug("Start Display");
        }
    }

    private final class DisplayStopHandler extends RequestHandler {

        public DisplayStopHandler() {
            super(MAPPINGS_TOPO_DISPLAY_STOP);
        }

        @Override
        public void process(ObjectNode payload) {
            log.debug("Stop Display");
        }
    }
}
