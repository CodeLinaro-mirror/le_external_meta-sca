SUMMARY = "Annotate AST trees with source code positions"
HOMEPAGE = "https://github.com/gristlabs/asttokens"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d9b931fa23ab1cacd0087f9e2ee12c0"

SRC_URI[sha256sum] = "3ecdbd8f2cc195f53ccada3a613538bb5f9ef6f6869129f13e03c30a677b8fe2"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "asttokens"
