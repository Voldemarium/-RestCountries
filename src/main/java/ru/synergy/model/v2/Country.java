/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package ru.synergy.model.v2;


import ru.synergy.model.BaseCountry;

import java.util.List;

public class Country extends BaseCountry {

  private List<Currency> currencies;
  private List<Language> languages;
  private Translations translations;
  private String flag;
  private List<RegionalBloc> regionalBlocs;
  private String cioc;
  private boolean independent;

  public List<Currency> getCurrencies() {
    return currencies;
  }

  public List<Language> getLanguages() {
    return languages;
  }

  public Translations getTranslations() {
    return translations;
  }

  public String getFlag() {
    return flag;
  }

  public List<RegionalBloc> getRegionalBlocs() {
    return regionalBlocs;
  }

  public String getCioc() {
    return cioc;
  }

  public boolean isIndependent() {
    return independent;
  }
}
