(ns secondns
  "A second NS outside the first source path")

(defn func
  []
  true)

(def notafunc false)

(defn other-func
  []
  (func))
