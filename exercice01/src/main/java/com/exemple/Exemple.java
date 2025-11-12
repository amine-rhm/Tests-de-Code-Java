package com.exemple;

/**
 * Ma classe d'exemple.
 * Cette classe représente un exemple avec une chaîne de caractères
 * et une valeur entière.
 */
public final class Exemple {
  private final String texte;
  private int valeur;

  /**
   * Constructeur de la classe Exemple.
   *
   * @param texte la chaîne de caractères à stocker
   * @throws IllegalArgumentException si texte est null
   */
  public Exemple(final String texte) {
    if (texte == null) {
      throw new IllegalArgumentException(
          "Le paramètre texte ne peut pas être null"
      );
    }
    this.texte = texte;
    this.valeur = 0;
  }

  /**
   * Obtient la valeur de valeur.
   *
   * @return la valeur entière valeur
   */
  public int getValeur() {
    return this.valeur;
  }

  /**
   * Modifie la valeur de valeur.
   *
   * @param valeur la nouvelle valeur de valeur
   */
  public void setValeur(final int valeur) {
    this.valeur = valeur;
  }

  /**
   * Obtient la chaîne texte si valeur est positif.
   *
   * @return la chaîne texte si valeur est strictement positif,
   *         une chaîne vide sinon
   */
  public String getTexte() {
    if (this.valeur > 0) {
      return this.texte;
    }
    return "";
  }
}

  
