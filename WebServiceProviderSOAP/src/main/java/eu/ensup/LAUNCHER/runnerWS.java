/*
 * Copyright 2020 lorris.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.ensup.LAUNCHER;

import eu.ensup.SERVICE.HelloObjisWS;
import javax.xml.ws.Endpoint;

/**
 *
 * @author lorris
 */
public class runnerWS {
    
        private static final String uri = "http://localhost:8091/hello";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HelloObjisWS wsImpl = new HelloObjisWS();
        Endpoint endPoint = Endpoint.publish(uri, wsImpl);
        boolean statut = endPoint.isPublished();
        System.out.println("Resultat du ws " + statut);
        
        
    }
    
}
