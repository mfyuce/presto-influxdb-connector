/*
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
package com.facebook.presto.influxdb;


import io.trino.spi.connector.Connector;
import io.trino.spi.connector.ConnectorContext;
import io.trino.spi.connector.ConnectorFactory;

import java.util.Map;

public class InfluxdbConnectorFactory
        implements ConnectorFactory
{
    public String getName()
    {
        return "influxdb";
    }

//    @Override
//    public ConnectorHandleResolver getHandleResolver()
//    {
//        return new InfluxdbHandleResolver();
//    }

    @Override
    public Connector create(String catalogName, Map<String, String> config, ConnectorContext context)
    {
        String url = config.get("connection-url");
        InfluxdbConnector connector = new InfluxdbConnector(url,
                catalogName,
                config.get("connection-org"),
                config.get("connection-token"),
                config.get("connection-bucket"));
        return connector;
    }
}
