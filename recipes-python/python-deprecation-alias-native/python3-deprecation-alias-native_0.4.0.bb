SUMMARY = "A wrapper around 'deprecation' providing support for deprecated aliases."
HOMEPAGE = "https://github.com/domdfcoding/deprecation-alias"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5649ee3559093f2fd471058ae867a8c"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
DEPENDS += "\
    python3-deprecation-native \
    python3-hatch-requirements-txt-native \
    python3-packaging-native \
"

SRC_URI[sha256sum] = "a58d2e74491c7834e9d318788da60272fa2f81aeb814b4055a4ba90a0a41740f"

inherit pypi
inherit python_hatchling
inherit_defer native

do_configure:prepend() {
    sed -i 's#"setuptools!=.*"#"setuptools"#g' ${S}/pyproject.toml
}

PYPI_PACKAGE = "deprecation_alias"
