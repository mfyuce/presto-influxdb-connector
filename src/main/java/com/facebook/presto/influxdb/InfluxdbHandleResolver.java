///*
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.facebook.presto.influxdb;
//
//
//import io.trino.spi.connector.ColumnHandle;
//import io.trino.spi.connector.ConnectorSplit;
//import io.trino.spi.connector.ConnectorTableHandle;
//import io.trino.spi.connector.ConnectorTransactionHandle;
//
//public class InfluxdbHandleResolver
//        implements ConnectorHandleResolver
//{
//    @Override
//    public Class<? extends ConnectorTableHandle> getTableHandleClass()
//    {
//        return InfluxdbTableHandle.class;
//    }
//
//
//    @Override
//    public Class<? extends ColumnHandle> getColumnHandleClass()
//    {
//        return InfluxdbColumnHandle.class;
//    }
//
//    @Override
//    public Class<? extends ConnectorSplit> getSplitClass()
//    {
//        return InfluxdbSplit.class;
//    }
//
//    @Override
//    public Class<? extends ConnectorTransactionHandle> getTransactionHandleClass()
//    {
//        return InfluxdbTransactionHandle.class;
//    }
//}
