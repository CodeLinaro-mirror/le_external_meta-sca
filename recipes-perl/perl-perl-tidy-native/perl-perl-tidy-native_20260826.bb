SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=9afeda422fe5b2bbffca6a1453849a6d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "104e3e5ee5c84524d5e50324d664c7859b1ac422ab97a3e7a248985a4b4f7f64"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
