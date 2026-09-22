SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    python3-cryptography-native \
    python3-deprecated-native \
"

PYPI_PACKAGE = "jwcrypto"

SRC_URI[sha256sum] = "a1e1570da5c2e35dbcd375ec1d2891a24de8eb35ee2c1fe8e91978efb72cfe90"

inherit pypi
inherit setuptools3
inherit_defer native
