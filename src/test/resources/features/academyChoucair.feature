# Autor: Duban Esteban Grisales Zapata

  @stories
  Feature: Academy Choucair
    As a user, i want to learn how  to automate  in screamplay at the Choucair Academy with the automation course

  @scenario1

  Scenario : Search for a automation course

    Given than Rose want to learn automation at the academy Choucair
    | strUser | strPassword |
    | 1017239056 | Choucair2021* |

    When  she search  for  the course on the  Choucair Academy  platform

    | strCourse |
    | Metodología Bancolombia |

    Then she finds the course called

    | strCourse |
    | Metodología Bancolombia |