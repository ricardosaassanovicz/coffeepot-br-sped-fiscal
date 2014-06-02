/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco9;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
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
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "9900"),
    @Field(name = "regBlc"),
    @Field(name = "qtdRegBlc")
})
public class Reg9900 {

    private String regBlc;
    private Long qtdRegBlc;

    public String getRegBlc() {
        return regBlc;
    }

    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }

    public Long getQtdRegBlc() {
        return qtdRegBlc;
    }

    public void setQtdRegBlc(Long qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
    }
}
