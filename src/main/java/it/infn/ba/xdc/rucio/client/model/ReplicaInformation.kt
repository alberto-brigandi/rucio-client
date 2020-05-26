/*
 * Copyright © 2019-2020 the original author or authors.
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
 *
 */

package it.infn.ba.xdc.rucio.client.model

data class ReplicaInformation(
        val adler32: String?,
        val bytes: Long?,
        val md5: String?,
        val name: String,
        val pfns: Map<String, Pfn>,
        val rses: Map<String, List<String>>,
        val scope: String,
        val states: Map<String, String>
)

data class Pfn(
        val clientExtract: Boolean,
        val domain: String,
        val priority: Int,
        val rse: String,
        val rseId: String,
        val type: String,
        val volatile: Boolean
)