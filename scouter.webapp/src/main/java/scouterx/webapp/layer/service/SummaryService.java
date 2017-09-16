/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package scouterx.webapp.layer.service;

import scouterx.webapp.layer.consumer.SummaryConsumer;
import scouterx.webapp.model.summary.ServiceSummaryItem;
import scouterx.webapp.model.summary.SqlSummaryItem;
import scouterx.webapp.model.summary.Summary;
import scouterx.webapp.request.SummaryRequest;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2017. 9. 14.
 */
public class SummaryService {
    private final SummaryConsumer summaryConsumer = new SummaryConsumer();

    public Summary<ServiceSummaryItem> retrieveServiceSummary(SummaryRequest request) {
        return summaryConsumer.retrieveServiceSummary(request);
    }

    public Summary<SqlSummaryItem> retrieveSqlSummary(SummaryRequest request) {
        return summaryConsumer.retrieveSqlSummary(request);
    }
}
