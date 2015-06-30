(ns yagni-test.datatypes
  "Test examples for defprotocol, deftype, defrecord")

(defprotocol UsedProtocol
  (foo [this]))

(deftype UsedTypeImplementingUsedProtocol []
  UsedProtocol
  (foo [this]
    true))

(deftype UnusedTypeImplementingUsedProtocol []
  UsedProtocol
  (foo [this]
    false))

(defprotocol UnusedProtocol
  (flub [this]))
