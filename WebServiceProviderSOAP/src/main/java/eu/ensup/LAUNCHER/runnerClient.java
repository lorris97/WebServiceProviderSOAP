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

import client.HelloObjis;
import client.HelloObjisWSService;

/**
 *
 * @author lorris
 */
public class runnerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HelloObjisWSService service = new HelloObjisWSService();
        HelloObjis port = service.getHelloObjisWSPort();
        String result = port.bonjour("toi");
        System.out.println("resultat " + result);
        
        // TODO code application logic here
    }
    
}
